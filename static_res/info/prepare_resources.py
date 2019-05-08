
import glob
import sys
import hashlib
import os
import json


root_dir = os.path.abspath(sys.argv[1])
work_dir = os.path.join(root_dir, "res/")
result_dir = os.path.join(root_dir, "info")
print ("root:   " + root_dir)
print ("work:   " + work_dir)
print ("result: " + result_dir)

def hash_bytestr_iter(bytesiter, hasher, ashexstr=False):
    for block in bytesiter:
        hasher.update(block)
    return hasher.hexdigest() if ashexstr else hasher.digest()

def file_as_blockiter(afile, blocksize=65536):
    with afile:
        block = afile.read(blocksize)
        while len(block) > 0:
            yield block
            block = afile.read(blocksize)

resources_file = {}
resources_array = []

for filename in glob.iglob(work_dir + '**/*', recursive=True):
    if os.path.isfile(filename):
        hexSha256Half = hash_bytestr_iter(file_as_blockiter(open(os.path.abspath(filename), 'rb')), hashlib.sha256(), True)[:16]
        item = {}
        item['id'] = os.path.relpath(filename, root_dir).replace(os.sep, '_').split('.')[0]
        item['path'] = os.path.relpath(filename, root_dir)
        item['checksum']=hexSha256Half
        resources_array.append(item)
        print(item)

resources_file['data'] = resources_array
hasher = hashlib.sha256()
hasher.update(json.dumps(resources_array, sort_keys=True).encode('utf-8'))
resources_file['checksum'] = hasher.hexdigest()[:16]

with open(os.path.join(result_dir, "description.json"), 'wt') as destFile:
    destFile.write(json.dumps(resources_file, sort_keys=True))


package pl.czympojade.common;

import java.io.Serializable;

import com.google.gson.Gson;


public interface Jsonable extends Serializable {

	default String toJson() {

		return new Gson().toJson(this);
	}

	static <O> O fromJson(Class<O> clazz, String json) {

		return new Gson().fromJson(json, clazz);
	}
}

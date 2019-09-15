package pl.czympojade.common;

import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public interface Jsonable extends Serializable {

	default String toJson() {

		Gson gson = new GsonBuilder()
				.create();
		return gson.toJson(this);
	}

	static <O> O fromJson(Class<O> clazz, String json) {

		Gson gson = new GsonBuilder()
				.create();

		return gson.fromJson(json, clazz);
	}
}

package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.up1.RedisUtil;

public class TestRedis {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-redis.xml");
		RedisUtil redisUtil = (RedisUtil) context.getBean("redisUtil");

		// =====================testString======================
		// redisUtil.set("name", "王赛超");
		// redisUtil.set("age", 24);
		// redisUtil.set("address", "河北邯郸");

		// System.out.println(redisUtil.set("address", "河北邯郸", 1800));

		// System.out.println(redisUtil.get("age"));
		// System.out.println(redisUtil.get("name"));
		// System.out.println(redisUtil.get("address"));

		// redisUtil.set("age", 1000);

		// Object object = redisUtil.get("user2");

		// System.out.println(object);

		// redisUtil.del("address");
		// redisUtil.set("class", 15);
		// long incr = redisUtil.incr("a", 1);
		// System.out.println(incr);

		// Map<String, Object> map = new HashMap<>();
		// map.put("name", "王赛超");
		// map.put("age", 24);
		// map.put("address", "河北邯郸666");
		// redisUtil.hmset("15532002725", map, 1000);

		// redisUtil.del("15532002725");
		// redisUtil.hset("15532002725", "address", "河北邯郸", 1000);
		// redisUtil.hdel("15532002725", "name");

		// System.out.println(redisUtil.sSetAndTime("15532002727", 1000,
		// "haha"));
		// System.out.println(redisUtil.sGet("15532002727"));
		// System.out.println(redisUtil.sHasKey("15532002727", "name"));

		List<Object> list1 = new ArrayList<Object>();
		// list1.add("4444");
		// System.out.println(redisUtil.lSet("ss", list1, 100));
		// System.out.println(redisUtil.lGetIndex("ss", 0));
		// System.out.println(redisUtil.lGet("ss", 0, -1));
		// System.out.println(redisUtil.lRemove("ss", 5, "1234"));
		// System.out.println(redisUtil.lGet("ss", 0, -1));
		// System.out.println(redisUtil.lGetListSize("ss"));

		// System.out.println(redisUtil.lRemove("15532002728", 1, 2));
		// System.out.println(redisUtil.lGet("15532002728", 0, -1));
		// System.out.println(redisUtil.lGetListSize("15532002728"));
		// System.out.println(redisUtil.lGetIndex("15532002728", 1));

		// System.out.println(redisUtil.getExpire("ss"));
		// System.out.println(redisUtil.getExpire("15532002725"));

		// System.out.println(redisUtil.hget("15532002725", "name"));
		// System.out.println(redisUtil.hmget("15532002725"));

		HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
		hashMap1.put("a1", "gtgtgtgtgtgtggt");
		System.out.println(redisUtil.hmset("hashMap1", hashMap1, 2000));
		System.out.println(redisUtil.hget("hashMap1", "a1"));
		// redisUtil.hdel("hashMap1", "a1");
		// System.out.println(redisUtil.hget("hashMap1", "a1"));

	}

}

class User {
	private String	name;
	private Integer	age;
	private String	address;
	private Double	classz;
	private Float	classz2;

	public User() {
		super();
	}

	public User(String name, Integer age, String address, Double classz, Float classz2) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.classz = classz;
		this.classz2 = classz2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getClassz() {
		return classz;
	}

	public void setClassz(Double classz) {
		this.classz = classz;
	}

	public Float getClassz2() {
		return classz2;
	}

	public void setClassz2(Float classz2) {
		this.classz2 = classz2;
	}
}
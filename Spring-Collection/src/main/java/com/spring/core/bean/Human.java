package com.spring.core.bean;

/**
 * @author KaustubhWaghmare
 *
 */
public class Human {
	private String name;
	private String language;
	private int age;
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}



	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}



	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}



	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Human [name=" + name + ", language=" + language + ", age=" + age + "]";
	}
	

}

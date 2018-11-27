package com.spring.core.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author KaustubhWaghmare
 *
 */
public class Student {
	private List<Object> lists;
	private Set<Object> sets;
	private Map<Object, Object> maps;
	private Properties pros;
	/**
	 * @return the lists
	 */
	public List<Object> getLists() {
		return lists;
	}
	/**
	 * @param lists the lists to set
	 */
	public void setLists(List<Object> lists) {
		this.lists = lists;
	}
	/**
	 * @return the sets
	 */
	public Set<Object> getSets() {
		return sets;
	}
	/**
	 * @param sets the sets to set
	 */
	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}
	/**
	 * @return the maps
	 */
	public Map<Object, Object> getMaps() {
		return maps;
	}
	/**
	 * @param maps the maps to set
	 */
	public void setMaps(Map<Object, Object> maps) {
		this.maps = maps;
	}
	/**
	 * @return the pros
	 */
	public Properties getPros() {
		return pros;
	}
	/**
	 * @param pros the pros to set
	 */
	public void setPros(Properties pros) {
		this.pros = pros;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [lists=" + lists + ", sets=" + sets + ", maps=" + maps + ", pros=" + pros + "]";
	}
	
	

}

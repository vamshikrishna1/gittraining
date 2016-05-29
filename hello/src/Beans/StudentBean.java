package Beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentBean {

	private String firstName="vamshi";
	private String lastName;
	private String country;
	private List<String> countryList;
	private List<String> pList;
	private String pLang="C";
	private List<String> languagesKnown;
	
	
	
	
	
	
	public List<String> getLanguagesKnown() {
		return languagesKnown;
	}
	public void setLanguagesKnown(List<String> languagesKnown) {
		this.languagesKnown = languagesKnown;
	}
	public String getpLang() {
		return pLang;
	}
	public void setpLang(String pLang) {
		this.pLang = pLang;
	}
	public List<String> getpList() {
		return pList;
	}
	public void setpList(List<String> pList) {
		this.pList = pList;
	}
	public List<String> getCountryList() {
		return countryList;
	}
	public void setCountryList(List<String> countryList) {
		this.countryList = countryList;
	}
	public StudentBean(){
		countryList=new ArrayList<>();
		countryList.add("India");
		countryList.add("Belgium");
		countryList.add("France");
		countryList.add("UnitedStated");
		countryList.add("United kingdom");
	   
		pList=new ArrayList<>();
		pList.add("Java");
		pList.add("C");
		pList.add("C++");
		pList.add("PHP");
		
	
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}

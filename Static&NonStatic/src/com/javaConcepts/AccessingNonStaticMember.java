package com.javaConcepts;

public class AccessingNonStaticMember{

	  private String myData = "Hello Mr Nitish";

	  public String getData(){
	     return myData;
	  }
	  public static void main(String[] args){
		  AccessingNonStaticMember obj = new AccessingNonStaticMember();
	     System.out.println(obj.getData());
	  }
	}

package com.syntax.review;

public class FamilyDemo {
	public static void main(String[] args) {
		JamesMember.lastName = "James";
		// JamesMember.firstName = "John";

		JamesMember member1 = new JamesMember();
		member1.firstName = "Lebron";
		member1.age = 34;

		JamesMember member2 = new JamesMember();
		member2.firstName = "Savannah";
		member2.age = 28;

		member1.fullName();
		member2.fullName();
		
		SmithMember member3 = new SmithMember();
		SmithMember.count++;
		
		member3.firstName = "Josh";
		member3.age = 34;

		SmithMember member4 = new SmithMember();
		SmithMember.count++;
		member4.firstName = "Rita";
		member4.age = 28;

		member3.fullName();
		member4.fullName();
		
		System.out.println(SmithMember.count);
		

		// HW for Hichem
		// Create another class called SmithMember
		// have a static int variable count
		// when you create a member of Smith Family
		// you increment the count by one
		// print how many members of
		// Smith Family they are
	}

}

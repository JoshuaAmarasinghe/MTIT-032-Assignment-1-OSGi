package com.mtit.MembershipRegisterSubscriber;

import java.util.List;
import java.util.Scanner;

import com.mtit.MembershipRegisterPublisher.Membership;
import com.mtit.MembershipRegisterPublisher.MembershipPublisher;

public class MembershipSubscriberImpl implements MembershipSubscriber {

	String input;
	String member_ID;
	String fname;
	String lname;
	String contact_no;
	String mem_type;
	String valid_years;
	Scanner sc = new Scanner(System.in);

	public static final String ADD = "add";
	public static final String All = "all";
	public static final String DELETE = "delete";

	@Override
	public void getService(MembershipPublisher membershippublisher) {
		System.out.println();
		System.out.println("=========== Membership Registration ============");
		System.out.println("                Gym Fitness 032                 ");
		System.out.println();
		System.out.println("Select the desired service from the below menu. ");
		System.out.println();

		while (true) {
			input = getInput();

			if (input.equalsIgnoreCase(ADD)) {
				addRecord(membershippublisher);
			} else if (input.equalsIgnoreCase(All)) {
				getAllRecords(membershippublisher);
			} else if (input.equalsIgnoreCase(DELETE)) {
				deleteRecord(membershippublisher);
			} else {
				System.out.println("Invalid");
			}
		}

	}

	public String getInput() {
		System.out.println("=========== Membership Registration ============");
		System.out.println("Add Members:                               'Add'");
		System.out.println("View Member Details:                       'All'");
		System.out.println("Remove Members:                         'Delete'");
		System.out.println();
		System.out.println("Type the prefered Selection:                    ");
		String input = sc.nextLine();
		return input;

	}

	public void addRecord(MembershipPublisher membershippublisher) {
		System.out.println("Enter Member ID:");
		member_ID = sc.nextLine();

		System.out.println("Enter Member's First Name:");
		fname = sc.nextLine();

		System.out.println("Enter Member's Last Name");
		lname = sc.nextLine();

		System.out.println("Enter Contact Number:");
		contact_no = sc.nextLine();

		System.out.println("Enter Membership Type:");
		mem_type = sc.nextLine();

		System.out.println("Enter Membership Valid for (Year): ");
		valid_years = sc.nextLine();

		String temp = membershippublisher.addMember(member_ID, fname, lname, contact_no, mem_type, valid_years);
		System.out.println(temp);
		System.out.println();
	}

	public void getAllRecords(MembershipPublisher membershippublisher) {
		List<Membership> memberships = membershippublisher.getAllMembers();

		System.out.println();
		System.out.println("Displaying all Registered Gym Members ");
		System.out.println();
		System.out.println("ID \t Full Name");
		for (Membership membership : memberships) {
			System.out.println();
			System.out.println(membership.getmember_ID() + "\t" + membership.getFname() + " " + membership.getLname());
			System.out.println();
		}

		System.out.println();
	}

	private void deleteRecord(MembershipPublisher membershippublisher) {
		String member_id;

		System.out.println("Enter Member's ID to be deleted: ");
		member_id = sc.nextLine();
		membershippublisher.deleteMember(member_id);
		System.out.println();
	}

}

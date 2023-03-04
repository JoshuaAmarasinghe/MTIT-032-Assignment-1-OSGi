package com.mtit.MembershipRegisterPublisher;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.mtit.MembershipRegisterPublisher.Membership;
import com.mtit.MembershipRegisterPublisher.MembershipPublisher;

public class MembershipPublishImpl implements MembershipPublisher {
	
	public List<Membership> memberships = new ArrayList<Membership>();

	//adding a new record 
	@Override
	public String addMember(String member_ID, String fname, String lname, String contact_no, String mem_type, String valid_years) {
          Membership membership = new Membership (member_ID, fname,lname,contact_no,mem_type,valid_years);
          memberships.add(membership);
          return "New Member: " + membership.getFname() + " " + membership.getLname() + " " + "registered successfully!";
     
	}

	//Get all records 
	@Override
	public List <Membership> getAllMembers() {
		return memberships;
			
	}

	//Delete Record
	@Override
	public void deleteMember(String member_ID) {
	    for(Membership membership : memberships) {
	    	if(membership.getmember_ID().equalsIgnoreCase(member_ID)) {
	    		int id =memberships.indexOf(membership);
	    		memberships.remove(id);
	    		System.out.println("Delete Member Record" + id + "Successfully");
	    		return ;
	    	}
	    }
		
	}
	
	
	
}

package service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import model.Member;

public class MemberService {
	public static final MemberService instance =new MemberService(); 
	
	 private Map<String, Member>members;
	 private MemberService(){
		 members= new HashMap<String,Member>();
	 }
	public static MemberService getInstanace() {
		// TODO Auto-generated method stub
		return instance;
	}
	

	public Member Login(String id,String password){
	//사용 객체를 중복저장하지않게 set컬렉션
		Set<String>keySet=members.keySet();
		Iterator<String>keyIterator=keySet.iterator();//반복해서 키얻음
		while(keyIterator.hasNext()){
			String key=keyIterator.next();
			Member value=members.get(key);//키의 value값
			if(id.equals(key))
				if(password.equals(value.getPassword()))
					return members.get(key.toLowerCase());
				else
					break;
		}
		
		return null;
	}
	
	  public void addMember(Member member){//id:키, value값에 member객체를 추가
			members.put(member.getId(),member);
		  }

}

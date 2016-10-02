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
	//��� ��ü�� �ߺ����������ʰ� set�÷���
		Set<String>keySet=members.keySet();
		Iterator<String>keyIterator=keySet.iterator();//�ݺ��ؼ� Ű����
		while(keyIterator.hasNext()){
			String key=keyIterator.next();
			Member value=members.get(key);//Ű�� value��
			if(id.equals(key))
				if(password.equals(value.getPassword()))
					return members.get(key.toLowerCase());
				else
					break;
		}
		
		return null;
	}
	
	  public void addMember(Member member){//id:Ű, value���� member��ü�� �߰�
			members.put(member.getId(),member);
		  }

}

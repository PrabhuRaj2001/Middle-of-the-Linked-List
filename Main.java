public void middle(int mid) {
		// TODO Auto-generated method stub
		
		node temp1=head;
		node temp3=head;
		int count=0;
		node temp2=head;
		while(temp1!=null)
		{
			count++;
			temp1=temp1.next;
		}
		int c=count%2==0 ? count/2:(count/2)+1;
		count=0;
		int val=0;
		while(count!=c)
		{
			val=temp2.val;
			count++;
			temp2=temp2.next;
		}
		
		while(temp2!=null)
		{
			temp3.val=temp2.val;
			temp3=temp3.next;
			temp2=temp2.next;
			System.out.println(temp3.val);
		}
		
	}
	
package javabeginner1;

public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Java is a programming language";
		str1=str1.trim();
		int num=0,index=0;
		do
		{
			++num;
			++index;
			index=str1.indexOf(' ',index);
		}while(index!=-1);
		int end=0;
		String strArray[]=new String[num];
		index=0;
		for(int i=0;i<num;i++) {
			end=str1.indexOf(' ', index);
			if(end==-1) {
				strArray[i]=str1.substring(index);
			}else {
				strArray[i]=str1.substring(index, end);
			}
			index=end+1;
		}
		for(String s:strArray) {
			System.out.print(s+"\n");
		}
		
	}

}

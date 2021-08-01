package learning.jdbc;


public class StuData2 {
	String sName;
	String sBranch;
	String sAddress;
	String sPhNo;
	int totMarks;
	float per;
	String result;
	StuData2(String sName,String sBranch,String sAddress,String sPhNo,int totMarks,float per,String result)
	{
	    this.sName=sName;
		this.sBranch=sBranch;
		this.sAddress=sAddress;
		this.sPhNo=sPhNo;
		this.totMarks=totMarks;
		this.per=per;
		this.result=result;
      }
	public String toString()
	{
		return sName+"\t"+sBranch+"\t"+sAddress+"\t"+sPhNo+"\t"+totMarks+"\t"+per+"\t"+result;
	}
}

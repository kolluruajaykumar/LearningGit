package learning.jdbc;


public class StuData {
	String rNo;
	String sName;
	String sBranch;
	String sAddress;
	String sPhNo;
	int totMarks;
	float per;
	String result;
	StuData(String rNo,String sName,String sBranch,String sAddress,String sPhNo,int totMarks,float per,String result)
	{
		this.rNo=rNo;
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
		return rNo+"\t"+sName+"\t"+sBranch+"\t"+sAddress+"\t"+sPhNo+"\t"+totMarks+"\t"+per+"\t"+result;
	}
	}



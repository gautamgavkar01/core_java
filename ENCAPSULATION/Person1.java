public class Person1 {
    private String name = "sandhya jayvant gavkar";
    private String DOB = "03-03-2005";
    private String bankName = "BOI";
    private String branch = "chandgad";
    private long acNumber = 5454545455455L;
    private String IFSC = "BKID000276";


    //Getters and setters for name
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    //Getters and setters for AGE

    public String getDOB()
    {
        return this.DOB;
    }

    public void setAge(String date)
    {
        this.DOB = date;
    }


    //Getter for bank name
    public String getBankName()
    {
        return this.bankName;
    }

    //Getter for branch name
    public String getBranch()
    {
       return this.branch;
    }

    //Getter for bank Account Number
    public long getAccountNumber()
    {
        return this.acNumber;
    }

    //Getter for IFSC code
    public String getIFSC()
    {
        return this.IFSC;
    }

}

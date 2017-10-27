package stepDefinition;

public class Transaction 
{
	private static String[] dataUi = {"01023A9AC","KAMPUNG DATOK KERAMAT","21/08/2016","FURHAN","TIKI"};
	
	public String[] getDataUi() 
	{
		return dataUi;
	}

	public String[][] getDataTransaction() 
	{
		String[][] dataTransaction = 
		{
            {"01023A9AA", "KAMPUNG DATOK KERAMAT", "21/08/2016", "FURHAN", "JNE"},
            {"01023A9AC", "JALAN GURNEY", "21/08/2016", "FURHAN", "REX"},
            {"01023A9AD", "UTM KUALA LUMPUR", "21/08/2016", "FURHAN", "POS"}
		};
		
		for(int i = 0 ; i < dataTransaction.length ; i++)
		{
          for (int j = 0; j<dataTransaction[i].length; j++)
          {
              System.out.print(dataTransaction[i][j]);
              System.out.print("\t");
          }
          System.out.println();
		}
		return dataTransaction;
	}

	public String[] getIndexMatch(String trxId, String[][] dataTransaction) 
	{
		int x = 0;
        for(int i = 0 ; i < dataTransaction.length ; i++)
        {
            if ( dataTransaction[i][0] == trxId)
            {
              x = i;
            }
        }
         return dataTransaction[x];
    }

	public boolean matchData(String[] getDataUi, String[] getIndexMatch) 
	{
		Transaction transaction = new Transaction();
		
		String[] dataView = transaction.getDataUi();
		String[] database = transaction.getIndexMatch(transaction.getDataUi()[0], transaction.getDataTransaction());
		boolean matchResult = false;
		 
		for(int i=1; i<dataView.length; i++)
		{
			 if(dataView[i] == database[i])
			 {
				 matchResult = true;
			 }
			 else
				 matchResult = false;
		}
			 return matchResult;
	}
}
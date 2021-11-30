package pos.machine;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class PosMachine {

    public HashMap< String , ItemInfo> getDB()
    {
        List<ItemInfo> itemDB = ItemDataLoader.loadAllItemInfos();
        HashMap<String , ItemInfo> indexDB= indexDB(itemDB);

        return indexDB;
    }

    public HashMap< String , ItemInfo > indexDB(List<ItemInfo> itemDB)
    {
        HashMap< String , ItemInfo> result = new HashMap< String , ItemInfo>();

        for(ItemInfo i: itemDB)
            result.put(i.getBarcode() , i);

        return result;
    }

    public HashMap<String , Integer> getItemCount(List<String> barcodes)
    {
        HashMap<String , Integer> result =new HashMap<String , Integer>();

        for(String i : barcodes)
        {

            if(result.get(i) == null)
            {

                result.put(i , 1);


            }
            else
            {

                result.put(i , result.get(i)+1 );
            }
        }

        return result;
    }

    public HashMap<String , Integer> calSubTotal(HashMap<String , Integer> itemCount)
    {
        return null;
    }

    public String printSubTotal(HashMap<String , Integer> subtotal)
    {
        return null;
    }


    public int getTotalPrice(HashMap<String , Integer> subtotal)
    {
        return 0;
    }

    public String printReceipt(List<String> barcodes)
    {
        HashMap<String , ItemInfo> indexDB= getDB();
        HashMap<String , Integer> itemCount = getItemCount(barcodes);

        System.out.println(itemCount.toString());
        return null;
    }
}

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
        return null;
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

        for(String k : indexDB.keySet())
            System.out.println(k + ' ' + indexDB.get(k).getName() + ' ' + indexDB.get(k).getPrice());

        return null;
    }
}

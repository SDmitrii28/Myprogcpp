package com.tasks.myprogcpp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buyarray;
    private Button buyarraytemp;
    private Button buybool;
    private Button buyboolmatr;
    private Button buyset;
    private Button buylist;
    private Button buyrational;
    private Button buycomplex;
    private Button buyrect;
    private Button buypoint;
    private Button buyshell;
    private Button buyshellsed;
    private Button buysheiker;
    private Button buyheap;
    private Button buyheaps;
    private Button buypobit;
    private Button buybubble;
    private Button buyhoara;
    private Button buytopolog;
    private Button buytopologlist;
    private Button buyestest;
    private Button buyhanoi;
    private Button buykmp;
    private Button buybm;
    private Button buybinari;
    private Button buykomi;
    private Button buyevrist;
    private Button buypoliz;

    private Button download_array;
    private Button download_arraytemp;
    private Button download_bool;
    private Button download_boolmatr;
    private Button download_set;
    private Button download_list;
    private Button download_rational;
    private Button download_complex;
    private Button download_rect;
    private Button download_point;
    private Button download_shell;
    private Button download_shellsed;
    private Button download_sheiker;
    private Button download_heap;
    private Button download_heaps;
    private Button download_pobit;
    private Button download_bubble;
    private Button download_hoara;
    private Button download_topolog;
    private Button download_topologlist;
    private Button download_estest;
    private Button download_hanoi;
    private Button download_kmp;
    private Button download_bm;
    private Button download_binari;
    private Button download_komi;
    private Button download_evrist;
    private Button download_poliz;

    private BillingClient mBillingClient;

    private Map<String, SkuDetails> mSkuDetailsMap = new HashMap<>();
    private String mSkuId_array = "sku_id_array";
    private String mSkuId_arraytemp = "sku_id_arraytemp";
    private String mSkuId_bool = "sku_id_bool";
    private String mSkuId_boolmatr = "sku_id_boolmatr";
    private String mSkuId_set= "sku_id_set";
    private String mSkuId_list = "sku_id_list";
    private String mSkuId_rational = "sku_id_rational";
    private String mSkuId_rect = "sku_id_rect";
    private String mSkuId_complex = "sku_id_complex";
    private String mSkuId_point = "sku_id_point";
    private String mSkuId_shell = "sku_id_shell";
    private String mSkuId_shellsed = "sku_id_shellsed";
    private String mSkuId_sheiker = "sku_id_sheiker";
    private String mSkuId_heap = "sku_id_heap";
    private String mSkuId_heaps = "sku_id_heaps";
    private String mSkuId_pobit = "sku_id_pobit";
    private String mSkuId_bubble = "sku_id_bubble";
    private String mSkuId_hoara = "sku_id_hoara";
    private String mSkuId_topologmatr = "sku_id_topologmatr";
    private String mSkuId_topologlist = "sku_id_topologlist";
    private String mSkuId_estestven = "sku_id_estestven";
    private String mSkuId_hanoi = "sku_id_hanoi";
    private String mSkuId_kmp = "sku_id_kmp";
    private String mSkuId_bm = "sku_id_bm";
    private String mSkuId_binari = "sku_id_binari";
    private String mSkuId_komi = "sku_id_komi";
    private String mSkuId_komi3 = "sku_id_komi3";
    private String mSkuId_poliz = "sku_id_poliz";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mBillingClient = BillingClient.newBuilder(this).setListener(new PurchasesUpdatedListener() {
            @Override
            public void onPurchasesUpdated(int responseCode, @Nullable List<Purchase> purchases) {
                if (responseCode == BillingClient.BillingResponse.OK && purchases != null) {
                    //сюда мы попадем когда будет осуществлена покупка

                    for (int i = 0; i < purchases.size(); i++) {
                        String purchaseId = purchases.get(i).getSku();

                        if(TextUtils.equals(mSkuId_array, purchaseId)){
                            download_array.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_arraytemp, purchaseId)){
                            download_arraytemp.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_bool, purchaseId)){
                            download_bool.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_boolmatr, purchaseId)){
                            download_boolmatr.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_set, purchaseId)){
                            download_set.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_list, purchaseId)){
                            download_list.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_rational, purchaseId)){
                            download_rational.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_rect, purchaseId)){
                            download_rect.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_point, purchaseId)){
                            download_point.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_complex, purchaseId)){
                            download_complex.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_shell, purchaseId)){
                            download_shell.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_shellsed, purchaseId))
                        {
                            download_shellsed.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_sheiker, purchaseId)){
                            download_sheiker.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_heap, purchaseId)){
                            download_heap.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_heaps, purchaseId)){
                            download_heaps.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_pobit, purchaseId)){
                            download_pobit.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_bubble, purchaseId)){
                            download_bubble.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_hoara, purchaseId)){
                            download_hoara.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_topologmatr, purchaseId)){
                            download_topolog.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_topologlist, purchaseId)){
                            download_topologlist.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_estestven, purchaseId)){
                            download_estest.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_hanoi, purchaseId)){
                            download_hanoi.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_kmp, purchaseId)){
                            download_kmp.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_bm, purchaseId)){
                            download_bm.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_binari, purchaseId)){
                            download_binari.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_komi, purchaseId)){
                            download_komi.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_komi3, purchaseId)){
                            download_evrist.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_poliz, purchaseId)){
                            download_poliz.setEnabled(true);
                        }
                    }
                }
            }
        }).build();
        mBillingClient.startConnection(new BillingClientStateListener() {
            @Override
            public void onBillingSetupFinished(@BillingClient.BillingResponse int billingResponseCode) {
                if (billingResponseCode == BillingClient.BillingResponse.OK) {
                    //здесь мы можем запросить информацию о товарах и покупках

                    querySkuDetails(); //запрос о товарах
                    List<Purchase> purchasesList = queryPurchases(); //запрос о покупках

                    //если товар уже куплен, предоставить его пользователю
                    for (int i = 0; i < purchasesList.size(); i++) {
                        String purchaseId = purchasesList.get(i).getSku();

                        if(TextUtils.equals(mSkuId_array, purchaseId)){
                            download_array.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_arraytemp, purchaseId)){
                            download_arraytemp.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_bool, purchaseId)){
                            download_bool.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_boolmatr, purchaseId)){
                            download_boolmatr.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_set, purchaseId)){
                            download_set.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_list, purchaseId)){
                            download_list.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_rational, purchaseId)){
                            download_rational.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_rect, purchaseId)){
                            download_rect.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_point, purchaseId)){
                            download_point.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_complex, purchaseId)){
                            download_complex.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_shell, purchaseId)){
                            download_shell.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_shellsed, purchaseId))
                        {
                            download_shellsed.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_sheiker, purchaseId)){
                            download_sheiker.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_heap, purchaseId)){
                            download_heap.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_heaps, purchaseId)){
                            download_heaps.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_pobit, purchaseId)){
                            download_pobit.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_bubble, purchaseId)){
                            download_bubble.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_hoara, purchaseId)){
                            download_hoara.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_topologmatr, purchaseId)){
                            download_topolog.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_topologlist, purchaseId)){
                            download_topologlist.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_estestven, purchaseId)){
                            download_estest.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_hanoi, purchaseId)){
                            download_hanoi.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_kmp, purchaseId)){
                            download_kmp.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_bm, purchaseId)){
                            download_bm.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_binari, purchaseId)){
                            download_binari.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_komi, purchaseId)){
                            download_komi.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_komi3, purchaseId)){
                            download_evrist.setEnabled(true);
                        }
                        else
                        if(TextUtils.equals(mSkuId_poliz, purchaseId)){
                            download_poliz.setEnabled(true);
                        }
                    }
                }
            }

            @Override
            public void onBillingServiceDisconnected() {
                //сюда мы попадем если что-то пойдет не так
            }
        });


        buyarray = (Button)findViewById(R.id.buyarray);
        buyarraytemp = (Button)findViewById(R.id.buyarraytemplate);
        buybool = (Button)findViewById(R.id.buybool);
        buyboolmatr = (Button)findViewById(R.id.buyboolMatr);
        buyset = (Button)findViewById(R.id.buyset);
        buylist = (Button)findViewById(R.id.buylist);
        buyrational = (Button)findViewById(R.id.buyrational);
        buycomplex = (Button)findViewById(R.id.buycomp);
        buyrect = (Button)findViewById(R.id.buyrectangle);
        buypoint = (Button)findViewById(R.id.buypoint);
        buyshell = (Button)findViewById(R.id.buyshell);
        buyshellsed = (Button)findViewById(R.id.buyshellsed);
        buysheiker = (Button)findViewById(R.id.buySheiker);
        buyheap = (Button)findViewById(R.id.buyHeap);
        buyheaps = (Button)findViewById(R.id.buyHeap1);
        buypobit = (Button)findViewById(R.id.buyPoBit);
        buybubble = (Button)findViewById(R.id.buyBubble);
        buyhoara = (Button)findViewById(R.id.buyHoara);
        buytopolog = (Button)findViewById(R.id.buyTopologMatr);
        buytopologlist = (Button)findViewById(R.id.buyTopologList);
        buyestest = (Button)findViewById(R.id.buyestes);
        buyhanoi = (Button)findViewById(R.id.buyHanoiskaya);
        buykmp = (Button)findViewById(R.id.buyKMP);
        buybm = (Button)findViewById(R.id.buyBM);
        buybinari = (Button)findViewById(R.id.buyBinari);
        buykomi = (Button)findViewById(R.id.buyKomi);
        buyevrist = (Button)findViewById(R.id.buyKomi3);
        buypoliz = (Button)findViewById(R.id.buyPoliz);

        download_array = (Button)findViewById(R.id.DownloadArray);
        download_arraytemp = (Button)findViewById(R.id.DownloadArrayTemp);
        download_bool = (Button)findViewById(R.id.DownloadBool);
        download_boolmatr = (Button)findViewById(R.id.DownloadBoolMatr);
        download_set = (Button)findViewById(R.id.DownloadSet);
        download_list = (Button)findViewById(R.id.DownloadList);
        download_rational = (Button)findViewById(R.id.DownloadRational);
        download_complex = (Button)findViewById(R.id.DownloadComp);
        download_rect = (Button)findViewById(R.id.DownloadRectangle);
        download_point = (Button)findViewById(R.id.DownloadPoint);
        download_shell = (Button)findViewById(R.id.DownloadShella);
        download_shellsed = (Button)findViewById(R.id.DownloadShellaSed);
        download_sheiker = (Button)findViewById(R.id.DownloadSheiker);
        download_heap = (Button)findViewById(R.id.DownloadHeap);
        download_heaps = (Button)findViewById(R.id.DownloadHeap1);
        download_pobit = (Button)findViewById(R.id.DownloadPoBit);
        download_bubble = (Button)findViewById(R.id.DownloadBubble);
        download_hoara = (Button)findViewById(R.id.DownloadHoara);
        download_topolog = (Button)findViewById(R.id.DownloadTopologMatr);
        download_topologlist = (Button)findViewById(R.id.DownloadTopologList);
        download_estest = (Button)findViewById(R.id.DownloadEstestFile);
        download_hanoi = (Button)findViewById(R.id.DownloadHanoiskaya);
        download_kmp = (Button)findViewById(R.id.DownloadKMP);
        download_bm = (Button)findViewById(R.id.DownloadBM);
        download_binari = (Button)findViewById(R.id.DownloadBinari);
        download_komi = (Button)findViewById(R.id.DownloadKomi);
        download_evrist = (Button)findViewById(R.id.DownloadKomi3);
        download_poliz = (Button)findViewById(R.id.DownloadPoliz);

        buyarray.setOnClickListener(this);
        buyarraytemp.setOnClickListener(this);
        buybool.setOnClickListener(this);
        buyboolmatr.setOnClickListener(this);
        buyset.setOnClickListener(this);
        buylist.setOnClickListener(this);
        buyrational.setOnClickListener(this);
        buycomplex.setOnClickListener(this);
        buyrect.setOnClickListener(this);
        buypoint.setOnClickListener(this);
        buyshell.setOnClickListener(this);
        buyshellsed.setOnClickListener(this);
        buysheiker.setOnClickListener(this);
        buyheap.setOnClickListener(this);
        buyheaps.setOnClickListener(this);
        buypobit.setOnClickListener(this);
        buybubble.setOnClickListener(this);
        buyhoara.setOnClickListener(this);
        buytopolog.setOnClickListener(this);
        buytopologlist.setOnClickListener(this);
        buyestest.setOnClickListener(this);
        buyhanoi.setOnClickListener(this);
        buykmp.setOnClickListener(this);
        buybm.setOnClickListener(this);
        buybinari.setOnClickListener(this);
        buykomi.setOnClickListener(this);
        buyevrist.setOnClickListener(this);
        buypoliz.setOnClickListener(this);

        download_array.setOnClickListener(this);
        download_arraytemp.setOnClickListener(this);
        download_bool.setOnClickListener(this);
        download_boolmatr.setOnClickListener(this);
        download_set.setOnClickListener(this);
        download_list.setOnClickListener(this);
        download_rational.setOnClickListener(this);
        download_complex.setOnClickListener(this);
        download_rect.setOnClickListener(this);
        download_point.setOnClickListener(this);
        download_shell.setOnClickListener(this);
        download_shellsed.setOnClickListener(this);
        download_sheiker.setOnClickListener(this);
        download_heap.setOnClickListener(this);
        download_heaps.setOnClickListener(this);
        download_pobit.setOnClickListener(this);
        download_bubble.setOnClickListener(this);
        download_hoara.setOnClickListener(this);
        download_topolog.setOnClickListener(this);
        download_topologlist.setOnClickListener(this);
        download_estest.setOnClickListener(this);
        download_hanoi.setOnClickListener(this);
        download_kmp.setOnClickListener(this);
        download_bm.setOnClickListener(this);
        download_binari.setOnClickListener(this);
        download_komi.setOnClickListener(this);
        download_evrist.setOnClickListener(this);
        download_poliz.setOnClickListener(this);

    }

    private void querySkuDetails() {
        SkuDetailsParams.Builder skuDetailsParamsBuilder = SkuDetailsParams.newBuilder();
        List<String> skuList = new ArrayList<>();
        skuList.add(mSkuId_array);
        skuList.add(mSkuId_arraytemp);
        skuList.add(mSkuId_bool);
        skuList.add(mSkuId_boolmatr);
        skuList.add(mSkuId_set);
        skuList.add(mSkuId_list);
        skuList.add(mSkuId_rational);
        skuList.add(mSkuId_rect);
        skuList.add(mSkuId_complex);
        skuList.add(mSkuId_point);
        skuList.add(mSkuId_shell);
        skuList.add(mSkuId_shellsed);
        skuList.add(mSkuId_sheiker);
        skuList.add(mSkuId_heap);
        skuList.add(mSkuId_heaps);
        skuList.add(mSkuId_pobit);
        skuList.add(mSkuId_bubble);
        skuList.add(mSkuId_hoara);
        skuList.add(mSkuId_topologmatr);
        skuList.add(mSkuId_topologlist);
        skuList.add(mSkuId_estestven);
        skuList.add(mSkuId_hanoi);
        skuList.add(mSkuId_kmp);
        skuList.add(mSkuId_bm);
        skuList.add(mSkuId_binari);
        skuList.add(mSkuId_komi);
        skuList.add(mSkuId_komi3);
        skuList.add(mSkuId_poliz);
        skuDetailsParamsBuilder.setSkusList(skuList).setType(BillingClient.SkuType.INAPP);
        mBillingClient.querySkuDetailsAsync(skuDetailsParamsBuilder.build(), new SkuDetailsResponseListener() {
            @Override
            public void onSkuDetailsResponse(int responseCode, List<SkuDetails> skuDetailsList) {
                if (responseCode == 0) {
                    for (SkuDetails skuDetails : skuDetailsList) {
                        mSkuDetailsMap.put(skuDetails.getSku(), skuDetails);
                    }
                }
            }
        });
    }

    public void launchBilling(String skuId) {
        BillingFlowParams billingFlowParams = BillingFlowParams.newBuilder()
                .setSkuDetails(mSkuDetailsMap.get(skuId))
                .build();
        mBillingClient.launchBillingFlow(this, billingFlowParams);
    }

    private List<Purchase> queryPurchases() {
        Purchase.PurchasesResult purchasesResult = mBillingClient.queryPurchases(BillingClient.SkuType.INAPP);
        return purchasesResult.getPurchasesList();
    }
    public  boolean isStoragePermissionGranted()
    {
        if (Build.VERSION.SDK_INT >= 23)
        {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED)
            {
                return true;

            }
            else
            {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                return false;
            }
        }
        else
        { //permission is automatically granted on sdk<23 upon installation
            return true;
        }
    }
    private void Download(InputStream input, String namedoc,String namefile) throws IOException {
        String str = "";
        StringBuffer buf = new StringBuffer();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input,"Cp1251"));
        if(input!=null)
        {
            while((str = reader.readLine())!=null){
                buf.append(str + "\n");
            }
        }
        input.close();
        CreateFile(buf.toString(),namedoc,namefile);
    }
    private File create(){
        File f=null;
        if (isStoragePermissionGranted())
        {
            if (android.os.Build.VERSION.SDK_INT >= 29)
            {
                // /storage/emulated/0/Android/data/org.o7planning.externalstoragedemo/files
                f = new File(this.getExternalFilesDir(null),"Программы на с++");
            }
            else {
                f = new File(Environment.getExternalStorageDirectory() + "/Download", "Программы на с++");
            }
            if (!f.exists())
            {
                f.mkdirs();
            }
        }
        return f;
    }

    private File createdir(String namedoc){
        File f=null;
        if (isStoragePermissionGranted())
        {
            if (android.os.Build.VERSION.SDK_INT >= 29)
            {
                // /storage/emulated/0/Android/data/org.o7planning.externalstoragedemo/files
                f = new File(this.getExternalFilesDir(null) + "/Программы на с++",namedoc);
            }
            else {
                f = new File(Environment.getExternalStorageDirectory() + "/Download" + "/Программы на с++",namedoc);
            }
            if (!f.exists())
            {
                f.mkdirs();
            }
        }
        return f;
    }
    private void CreateFile(String str, String namedoc, String namefile) throws IOException {
        File f1 = create();
        File f2 = createdir(namedoc);
        File f3=new File(f2,namefile);
        f3.createNewFile();
        try
        {
            BufferedWriter save = new BufferedWriter(new FileWriter(f3));
            save.write(str);
            Toast.makeText(this, "Файл сохранён в " + f3, Toast.LENGTH_SHORT).show();
            save.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void onClick(View view) {

        InputStream array_is1 = this.getResources().openRawResource(R.raw.arrayc);
        InputStream array_is2 = this.getResources().openRawResource(R.raw.arrayh);

        InputStream bool_is1 = this.getResources().openRawResource(R.raw.booleanc);
        InputStream bool_is2 = this.getResources().openRawResource(R.raw.bulvectorh);

        InputStream boolmatr_is1 = this.getResources().openRawResource(R.raw.boolmart);
        InputStream boolmatr_is2 = this.getResources().openRawResource(R.raw.boolmatrixc);
        InputStream boolmatr_is3 = this.getResources().openRawResource(R.raw.boolvectormatr);

        InputStream arraytemp_is1 = this.getResources().openRawResource(R.raw.arraytemp);
        InputStream arraytemp_is2 = this.getResources().openRawResource(R.raw.arraytemph);

        InputStream list_is1 = this.getResources().openRawResource(R.raw.list);
        InputStream list_is2 = this.getResources().openRawResource(R.raw.listh);

        InputStream set_is1 = this.getResources().openRawResource(R.raw.set);
        InputStream set_is2 = this.getResources().openRawResource(R.raw.seth);
        InputStream set_is3 = this.getResources().openRawResource(R.raw.boolvectorset);

        InputStream rational_is1 = this.getResources().openRawResource(R.raw.rational);

        InputStream complex_is1 = this.getResources().openRawResource(R.raw.complex);

        InputStream rect_is1 = this.getResources().openRawResource(R.raw.rectangle);
        InputStream rect_is2 = this.getResources().openRawResource(R.raw.rectangleh);

        InputStream point_is1 = this.getResources().openRawResource(R.raw.point);
        InputStream point_is2 = this.getResources().openRawResource(R.raw.pointh);

        InputStream shell_is1 = this.getResources().openRawResource(R.raw.shell);

        InputStream shellsed_is1 = this.getResources().openRawResource(R.raw.shellsed);

        InputStream sheiker_is1 = this.getResources().openRawResource(R.raw.sheiker);

        InputStream heap_is1 = this.getResources().openRawResource(R.raw.heap);

        InputStream heaps_is1 = this.getResources().openRawResource(R.raw.heaps);

        InputStream pobit_is1 = this.getResources().openRawResource(R.raw.pobit);

        InputStream bubble_is1 = this.getResources().openRawResource(R.raw.bubble);

        InputStream hoara_is1 = this.getResources().openRawResource(R.raw.hoara);

        InputStream topologmatr_is1 = this.getResources().openRawResource(R.raw.topolog);
        InputStream topologmatr_is2 = this.getResources().openRawResource(R.raw.boolmatrixtopolog);
        InputStream topologmatr_is3 = this.getResources().openRawResource(R.raw.boolvectortopolog);

        InputStream topologlist_is1 = this.getResources().openRawResource(R.raw.topologlist);
        InputStream topologlist_is2 = this.getResources().openRawResource(R.raw.topologlisth);

        InputStream estestvenfile_is1 = this.getResources().openRawResource(R.raw.estessort);

        InputStream hanoi_is1 = this.getResources().openRawResource(R.raw.hanois);

        InputStream kmp_is1 = this.getResources().openRawResource(R.raw.kmpsearch);

        InputStream bm_is1 = this.getResources().openRawResource(R.raw.bm);

        InputStream binari_is1 = this.getResources().openRawResource(R.raw.binari);

        InputStream komi_is1 = this.getResources().openRawResource(R.raw.komideik);

        InputStream komi3_is1 = this.getResources().openRawResource(R.raw.komi3);

        InputStream poliz_is1 = this.getResources().openRawResource(R.raw.poliz);

        switch(view.getId()){

            case R.id.buyarray:
            {
                launchBilling(mSkuId_array);
            }
            break;
            case R.id.buyarraytemplate:
            {
                launchBilling(mSkuId_arraytemp);
            }
            break;
            case R.id.buybool:
            {
                launchBilling(mSkuId_bool);
            }
            break;
            case R.id.buyboolMatr:
            {
                launchBilling(mSkuId_boolmatr);
            }
            break;
            case R.id.buyset:
            {
                launchBilling(mSkuId_set);
            }
            break;
            case R.id.buylist:
            {
                launchBilling(mSkuId_list);
            }
            break;
            case R.id.buyrational:
            {
                launchBilling(mSkuId_rational);
            }
            break;
            case R.id.buycomp:
            {
                launchBilling(mSkuId_complex);
            }
            break;
            case R.id.buyrectangle:
            {
                launchBilling(mSkuId_rect);
            }
            break;
            case R.id.buypoint:
            {
                launchBilling(mSkuId_point);
            }
            break;
            case R.id.buyshell:
            {
                launchBilling(mSkuId_shell);
            }
            break;
            case R.id.buyshellsed:
            {
                launchBilling(mSkuId_shellsed);
            }
            break;
            case R.id.buySheiker:
            {
                launchBilling(mSkuId_sheiker);
            }
            break;
            case R.id.buyHeap:
            {
                launchBilling(mSkuId_heap);
            }
            break;
            case R.id.buyHeap1:
            {
                launchBilling(mSkuId_heaps);
            }
            break;
            case R.id.buyPoBit:
            {
                launchBilling(mSkuId_pobit);
            }
            break;
            case R.id.buyBubble:
            {
                launchBilling(mSkuId_bubble);
            }
            break;
            case R.id.buyHoara:
            {
                launchBilling(mSkuId_hoara);
            }
            break;
            case R.id.buyTopologMatr:
            {
                launchBilling(mSkuId_topologmatr);
            }
            break;
            case R.id.buyTopologList:
            {
                launchBilling(mSkuId_topologlist);
            }
            break;
            case R.id.buyestes:
            {
                launchBilling(mSkuId_estestven);
            }
            break;
            case R.id.buyHanoiskaya:
            {
                launchBilling(mSkuId_hanoi);
            }
            break;
            case R.id.buyKMP:
            {
                launchBilling(mSkuId_kmp);
            }
            break;
            case R.id.buyBM:
            {
                launchBilling(mSkuId_bm);
            }
            break;
            case R.id.buyBinari:
            {
                launchBilling(mSkuId_binari);
            }
            break;
            case R.id.buyKomi:
            {
                launchBilling(mSkuId_komi);
            }
            break;
            case R.id.buyKomi3:
            {
                launchBilling(mSkuId_komi3);
            }
            break;
            case R.id.buyPoliz:
            {
                launchBilling(mSkuId_poliz);
            }
            break;

            case R.id.DownloadArray:
            {
                try {
                    Download(array_is1,"Класс (Массив)", "array.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    Download(array_is2,"Класс (Массив)", "Header.h");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadArrayTemp:
            {
                try {
                    Download(arraytemp_is1,"Класс (Массив шаблон)", "arraytemp.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    Download(arraytemp_is2,"Класс (Массив шаблон)", "Header1.h");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadBool:
            {

                try {
                    Download(bool_is1,"Класс (Булев вектор)", "boolvector.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    Download(bool_is2,"Класс (Булев вектор)", "Bulvector.h");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadBoolMatr:
            {

                try {
                    Download(boolmatr_is1,"Класс (Булева матрица)", "BoolMatrix.h");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    Download(boolmatr_is2,"Класс (Булева матрица)", "boolmatr.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    Download(boolmatr_is3,"Класс (Булева матрица)", "BoolVector.h");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadSet:
            {

                try {
                    Download(set_is1,"Класс (Множество)", "set.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    Download(set_is2,"Класс (Множество)", "Set.h");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    Download(set_is3,"Класс (Множество)", "Bulvector.h");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadList:
            {

                try {
                    Download(list_is1,"Класс (Список)", "list.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    Download(list_is2,"Класс (Список)", "List.h");
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            break;
            case R.id.DownloadRational:
            {

                try {
                    Download(rational_is1,"Класс (Рациональная дробь)", "rational.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadComp:
            {

                try {
                    Download(complex_is1,"Класс (Комплексные числа)", "complex.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadRectangle:
            {

                try {
                    Download(rect_is1,"Класс (Прямоугольник)", "rect.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    Download(rect_is2,"Класс (Прямоугольник)", "Rectangle.h");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadPoint:
            {

                try {
                    Download(point_is1,"Класс (Точка в пространстве)", "point.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    Download(point_is2,"Класс (Точка в пространстве)", "Point.h");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadShella:
            {

                try {
                    Download(shell_is1,"Сортировка (Шелла)", "shell.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadShellaSed:
            {

                try {
                    Download(shellsed_is1,"Сортировка (Шелла Седжвик)", "shellsed.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadSheiker:
            {
                try {
                    Download(sheiker_is1,"Сортировка (Шейкера)", "sheiker.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadHeap:
            {

                try {
                    Download(heap_is1,"Сортировка (Пирамидальная(1))", "heap.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadHeap1:
            {

                try {
                    Download(heaps_is1,"Сортировка (Пирамидальная(2))", "heaps.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadPoBit:
            {

                try {
                    Download(pobit_is1,"Сортировка (Побитовая)", "pobit.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadBubble:
            {

                try {
                    Download(bubble_is1,"Сортировка (Пузырьком)", "bubble.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadHoara:
            {

                try {
                    Download(hoara_is1,"Сортировка (Хоара)", "hoara.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadTopologMatr:
            {

                try {
                    Download(topologmatr_is1,"Сортировка (Топологическая на матрицах)", "topolog.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    Download(topologmatr_is2,"Сортировка (Топологическая на матрицах)", "BoolMatrix.h");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    Download(topologmatr_is3,"Сортировка (Топологическая на матрицах)", "BoolVector.h");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadTopologList:
            {

                try {
                    Download(topologlist_is1,"Сортировка (Топологическая на списках)", "topologlist.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    Download(topologlist_is2,"Сортировка (Топологическая на списках)", "TopList.h");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadEstestFile:
            {

                try {
                    Download(estestvenfile_is1,"Сортировка (Естественная на трёх файлах)", "estestven.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadHanoiskaya:
            {

                try {
                    Download(hanoi_is1,"Ханойские башни", "hanoi.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadKMP:
            {

                try {
                    Download(kmp_is1,"КМП - поиск", "kmp.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadBM:
            {

                try {
                    Download(bm_is1,"БМ - поиск", "bm.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadBinari:
            {

                try {
                    Download(binari_is1,"Бинарный поиск", "binari.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadKomi:
            {

                try {
                    Download(komi_is1,"Коммивояжер (Дейкстра)", "komi.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadKomi3:
            {

                try {
                    Download(komi3_is1,"Коммивояжер (Эвристика 3)", "komi3.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            case R.id.DownloadPoliz:
            {

                try {
                    Download(poliz_is1,"ПОЛИЗ", "poliz.cpp");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            break;
            default:
                break;
        }
    }
}
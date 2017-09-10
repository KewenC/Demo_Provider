package com.kewenc.demo_provider;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ProviderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider);
//        Uri uri=Uri.parse("content://com.kewenc.demo_provider.book.provider");
//        Log.d("ProviderActivity",Thread.currentThread().getName());
//        getContentResolver().query(uri,null,null,null,null);
//        getContentResolver().query(uri,null,null,null,null);
//        getContentResolver().query(uri,null,null,null,null);
        String html="" +
                "<p>AN " +
                    "<a href='http://example.com/'>" +
                        "<b>example</b>" +
                    "</a> link." +
                "</p>";
        Document doc=Jsoup.parse(html);
        Element link=doc.select("a").first();
        Log.d("HTML",doc.body().text());
        Log.d("HTML",link.attr("href"));
        Log.d("HTML",link.text());
        Log.d("HTML",link.outerHtml());
        Log.d("HTML",link.html());

    }
}

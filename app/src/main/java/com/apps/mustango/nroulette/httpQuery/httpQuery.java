package com.apps.mustango.nroulette.httpQuery;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Volodymyr Korzhovskyi on 30.09.2016.
 */
public class httpQuery {

    byte[] getUrlBytes(String urlSpec) throws IOException{
        //create object URL on base string http://*.*
        URL url=new URL(urlSpec);
        /*create connection object to http://*.*
        it open access to HTTP-interfaces to work with query methods,
        responses code, streaming and other's
        */
        HttpURLConnection connection=(HttpURLConnection)url.openConnection();

        try{
            ByteArrayOutputStream out=new ByteArrayOutputStream();
            InputStream in=connection.getInputStream();
            if (connection.getResponseCode()!=HttpURLConnection.HTTP_OK){
                return null;
            }

            int bytesRead=0;
            byte[] buffer=new byte[1024];
            //do cycle while data not end
            while ((bytesRead=in.read(buffer))>0){
                out.write(buffer,0,bytesRead);
            }
            out.close();
            return out.toByteArray();
        }finally {
         connection.disconnect();
        }
    }

    public String getUrl(String urlSpec)throws IOException{
        return new String(getUrlBytes((urlSpec)));
    }

}

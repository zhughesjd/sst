package com.metsci.sst;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.TreeSet;

public class Utility
{
    public static void main(String[] args) throws Exception{
        
    }
    /**
     * NEED TO FINISH THIS
     * @param lon0
     * @param lon1
     * @param lat0
     * @param lat1
     * @return
     * @throws Exception
     */
    public static String etopo1ToCASSBottomDepthTable(double lon0,double lon1,double lat0,double lat1) throws Exception{
        StringBuffer cassString = new StringBuffer();
        double minLon = Math.min( lon0, lon1 );
        double maxLon = Math.max( lon0, lon1 );
        double minLat = Math.min( lat0, lat1 );
        double maxLat = Math.max( lat0, lat1 );
        String urlString = "http://coastwatch.pfeg.noaa.gov/erddap/griddap/etopo360.csv?altitude[("+minLat+"):1:("+maxLat+")][("+minLon+"):1:("+maxLon+")]";
        URL oracle = new URL(urlString);
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));
        String inputLine;
        minLon = minLat = Double.POSITIVE_INFINITY;
        minLon = maxLat = Double.NEGATIVE_INFINITY;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
        return cassString.toString( );
    }
}

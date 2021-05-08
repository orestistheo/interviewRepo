package com.airhacks.Service;

import domains.Campaign;

import javax.ejb.Stateless;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Stateless
public class CampaignClientService implements Serializable {

    public List<Campaign> getCampaigns() {
        List<Campaign> campaignList = new ArrayList<>();
        List<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("GBR");
        countries.add("GRC");

        Campaign campaign = new Campaign();
        campaign.setId("5a3dce46");
        campaign.setName("Test Campaign 1");
        campaign.setPrice(1.23);
        campaign.setAdm("<a href=\"http://example.com/click/qbFCjzXR9rkf8qa4\">" +
                "<img src=\"http://assets.example.com/ad_assets/files/000/000/002/original/banner_300_250.png\"" +
                " height=\"250\" width=\"300\" alt=\"\"/></a><img src=\"http://example.com/win/qbFCjzXR9rkf8qa4\" " +
                "height=\"1\" width=\"1\" alt=\"\"/>\r\n");
        campaign.setTargetedCountries(countries);

        Campaign campaign1 = new Campaign();
        campaign1.setId("5a3fre46");
        campaign1.setName("Test Campaign 2");
        campaign1.setPrice(1.34);
        campaign1.setAdm("<a href=\"http://example.com/click/qbFCjzXR9rkf8qa4\">" +
                "<img src=\"http://assets.example.com/ad_assets/files/000/000/002/original/banner_300_250.png\"" +
                " height=\"250\" width=\"300\" alt=\"\"/></a><img src=\"http://example.com/win/qbFCjzXR9rkf8qa4\" " +
                "height=\"1\" width=\"1\" alt=\"\"/>\r\n");
        campaign1.setTargetedCountries(countries);

        List<String> countries2 = new ArrayList<>();
        countries2.add("CVG");
        countries2.add("RKO");

        Campaign campaign2 = new Campaign();
        campaign2.setId("c56bc77b");
        campaign2.setName("Test Campaign 2");
        campaign2.setPrice(0.45);
        campaign2.setAdm("<a href=\"http://example.com/click/qbFCjzXR9rkf8qa4\">" +
                "<img src=\"http://assets.example.com/ad_assets/files/000/000/002/original/banner_300_250.png\"" +
                " height=\"250\" width=\"300\" alt=\"\"/></a><img src=\"http://example.com/win/qbFCjzXR9rkf8qa4\" " +
                "height=\"1\" width=\"1\" alt=\"\"/>\r\n");
        campaign1.setTargetedCountries(countries2);

        campaignList.add(campaign2);

        List<String> countries3 = new ArrayList<>();
        countries3.add("BRA");
        countries3.add("EGY");

        Campaign campaign3 = new Campaign();
        campaign3.setId("a20579a5");
        campaign3.setName("Test Campaign 3");
        campaign3.setPrice(2.21);
        campaign3.setAdm("<a href=\"http://example.com/click/qbFCjzXR9rkf8qa4\">" +
                "<img src=\"http://assets.example.com/ad_assets/files/000/000/002/original/banner_300_250.png\"" +
                " height=\"250\" width=\"300\" alt=\"\"/></a><img src=\"http://example.com/win/qbFCjzXR9rkf8qa4\" " +
                "height=\"1\" width=\"1\" alt=\"\"/>\r\n");
        campaign1.setTargetedCountries(countries3);

        campaignList.add(campaign3);

        List<String> countries4 = new ArrayList<>();
        countries4.add("USA");

        Campaign campaign4 = new Campaign();
        campaign4.setId("e919799e");
        campaign4.setName("Test Campaign 4");
        campaign4.setPrice(0.39);
        campaign4.setAdm("<a href=\"http://example.com/click/qbFCjzXR9rkf8qa4\">" +
                "<img src=\"http://assets.example.com/ad_assets/files/000/000/002/original/banner_300_250.png\"" +
                " height=\"250\" width=\"300\" alt=\"\"/></a><img src=\"http://example.com/win/qbFCjzXR9rkf8qa4\" " +
                "height=\"1\" width=\"1\" alt=\"\"/>\r\n");
        campaign1.setTargetedCountries(countries4);

        campaignList.add(campaign4);

        List<String> countries5 = new ArrayList<>();
        countries3.add("GBR");

        Campaign campaign5 = new Campaign();
        campaign5.setId("ef88888f");
        campaign5.setName("Test Campaign 5");
        campaign5.setPrice(1.6);
        campaign5.setAdm("<a href=\"http://example.com/click/qbFCjzXR9rkf8qa4\">" +
                "<img src=\"http://assets.example.com/ad_assets/files/000/000/002/original/banner_300_250.png\"" +
                " height=\"250\" width=\"300\" alt=\"\"/></a><img src=\"http://example.com/win/qbFCjzXR9rkf8qa4\" " +
                "height=\"1\" width=\"1\" alt=\"\"/>\r\n");
        campaign1.setTargetedCountries(countries5);

        campaignList.add(campaign5);

        return campaignList;


    }
}

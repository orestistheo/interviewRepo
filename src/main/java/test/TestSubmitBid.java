package test;


import domains.App;
import domains.Bid;
import domains.Device;
import domains.Enums.OsEnum;
import domains.Geo;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSubmitBid {

    private static Client applicationClient;
    WebTarget webTarget;
    private Bid bidSuccess;
    private Bid bidFail;
    @Before
    public void setUp() {


        bidSuccess = new Bid();
        bidSuccess.setApp(new App());
        bidSuccess.setId("e7fe51ce4f6376876353ff0961c2cb0d");
        bidSuccess.setDevice(new Device());
        bidSuccess.getApp().setId("e7fe51ce-4f63-7687-6353-ff0961c2cb0d");
        bidSuccess.getApp().setName("Morecast Weather");
        bidSuccess.getDevice().setGeo(new Geo());
        bidSuccess.getDevice().getGeo().setCountry("USA");
        bidSuccess.getDevice().getGeo().setLat(0L);
        bidSuccess.getDevice().getGeo().setLon(0L);
        bidSuccess.getDevice().setOperatingSystem(OsEnum.ANDROID);

        bidFail = new Bid();
        bidFail.setApp(new App());
        bidFail.setId("e7fe51ce4f6376876353ff0961c2cb0d");
        bidFail.setDevice(new Device());
        bidFail.getApp().setId("e7fe51ce-4f63-7687-6353-ff0961c2cb0d");
        bidFail.getApp().setName("Morecast Weather");
        bidFail.getDevice().setGeo(new Geo());
        bidFail.getDevice().getGeo().setCountry("SVG");
        bidFail.getDevice().getGeo().setLat(0L);
        bidFail.getDevice().getGeo().setLon(0L);
        bidFail.getDevice().setOperatingSystem(OsEnum.ANDROID);

    }
    @Test
    public void createTestData(){
        try {
            applicationClient = ClientBuilder.newClient();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        webTarget = applicationClient.target("http://localhost:8080/Agora/resources/");
        Response response1 = webTarget
                .path("Campaigns/submitBid")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(bidSuccess, MediaType.APPLICATION_JSON));

        assertEquals(response1.getStatus(),Response.Status.OK.getStatusCode());
        response1.close();

        Response response2 = webTarget
                .path("Campaigns/submitBid")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(bidFail, MediaType.APPLICATION_JSON));

        assertEquals(response2.getStatus(),Response.Status.NO_CONTENT.getStatusCode());

    }
}

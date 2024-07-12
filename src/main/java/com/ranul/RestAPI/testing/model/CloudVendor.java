package com.ranul.RestAPI.testing.model;

public class CloudVendor {

    private String vendorID;

    private String vendorName;
    private String VendorAddress;
    private String VendorContact;

    public CloudVendor() {
    }

    public CloudVendor(String vendorID, String vendorName, String vendorAddress, String venderContact) {
        this.vendorID = vendorID;
        this.vendorName = vendorName;
        this.VendorAddress = vendorAddress;
        this.VendorContact = venderContact;
    }

    public String getVendorID() {
        return vendorID;
    }
    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return VendorAddress;
    }
    public void setVendorAddress(String vendorAddress) {
        VendorAddress = vendorAddress;
    }

    public String getVenderContact() {
        return VendorContact;
    }
    public void setVenderContact(String venderContact) {
        VendorContact = venderContact;
    }

}

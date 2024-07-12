package com.ranul.RestAPI.testing.controller;


import com.ranul.RestAPI.testing.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/CloudVendor")
public class CloudVendorAPIService {

    CloudVendor cloudVendor;

    @GetMapping("{vendorID}")
    public CloudVendor getCloudVendorDetails(String vendorID)
    {
        return cloudVendor;
                //new CloudVendor("C1","vendor01","Address01","xxxxxx");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorID}")
    public String deleteCloudVendorDetails(String vendorID)
    {
        this.cloudVendor=null;
        return "Cloud Vendor Deleted Successfully";
    }
}

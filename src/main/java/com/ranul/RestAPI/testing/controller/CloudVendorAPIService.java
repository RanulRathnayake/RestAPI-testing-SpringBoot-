package com.ranul.RestAPI.testing.controller;


import com.ranul.RestAPI.testing.model.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/CloudVendor")
public class CloudVendorAPIService {

    @GetMapping("{vendorID}")
    public CloudVendor getCloudVendorDetails(String vendorID)
    {
        return new CloudVendor(
                "C1",
                "vendor01",
                "Address01",
                "xxxxxx"
        );
    }
}

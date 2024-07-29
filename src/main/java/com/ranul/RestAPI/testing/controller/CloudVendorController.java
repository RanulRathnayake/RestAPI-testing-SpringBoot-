package com.ranul.RestAPI.testing.controller;


import com.ranul.RestAPI.testing.model.CloudVendor;
import com.ranul.RestAPI.testing.repository.CloudVendorRepository;
import com.ranul.RestAPI.testing.response.ResponseHandler;
import com.ranul.RestAPI.testing.service.CloudVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CloudVendor")
public class CloudVendorController
{

    CloudVendorService cloudVendorService;
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorID}")
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorID") String vendorID)
    {
        return ResponseHandler.responseBuilder("Requested Vendor detisles sre givrem", HttpStatus.OK, cloudVendorService.getCloudVendor(vendorID));



                //new CloudVendor("C1","vendor01","Address01","xxxxxx");
    }
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorsDetails()
    {
        return cloudVendorService.getALLCloudVendors();
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorID}")
    public String deleteCloudVendorDetails(@PathVariable("vendorID") String vendorID)
    {
        cloudVendorService.deleteCloudVendor(vendorID);
        return "Cloud Vendor Deleted Successfully";
    }
}

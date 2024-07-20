package com.ranul.RestAPI.testing.repository;

import com.ranul.RestAPI.testing.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
}

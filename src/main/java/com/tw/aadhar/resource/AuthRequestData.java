package com.tw.aadhar.resource;

import in.gov.uidai.core.model.xsd.auth.uid_auth_request_data._1.MatchingStrategy;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class AuthRequestData {

  private String uid;
  private String name;
  private MatchingStrategy nameMatchStrategy;
  private int nameMatchValue;
  private String gender;
  private String fullAddress;

}

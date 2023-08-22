<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>SA-CP15</name>
   <tag></tag>
   <elementGuidId>1649cf3c-d4b3-4fee-830c-f5bb434a1e7d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;contentType&quot;: &quot;application/x-www-form-urlencoded&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;,
  &quot;parameters&quot;: [
    {
      &quot;name&quot;: &quot;email&quot;,
      &quot;value&quot;: &quot;17 Agustus 1945&quot;
    }
  ]
}</httpBodyContent>
   <httpBodyType>x-www-form-urlencoded</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/x-www-form-urlencoded</value>
      <webElementGuid>e248d9d5-8de9-4e1b-af4e-cec85a33f18e</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIzIiwianRpIjoiNmE4Mzg0MjU4ZDEzMWYyNTAxZjJlNDlmMzg5ZTg5ZWVkMGM4MTg1NTA3ZDE2MTI2ZDMyOWE3OTY4ODI4N2Y4ZTk0MTJhOWMwODc2ZmFhYzciLCJpYXQiOjE2OTE4NjQ3ODMuOTAyODE3LCJuYmYiOjE2OTE4NjQ3ODMuOTAyODIxLCJleHAiOjE3MjM0ODcxODMuOTAwNzY4LCJzdWIiOiI3NzMiLCJzY29wZXMiOltdfQ.jJSjxdoe2LTaxoBkzXfNf3NvaYIKdajusidad4yccT5Ir6gZ3xNwBB3PLO53s2kAFRyQ2_AZOSaeT-acSEJN9yDNG9k-8r0WldIapItMCZTgSLYbrlus1l1vIx1EEhG0beWxh9Bk4kGAXzMs2iJDsQihe7D0zxS328Lp0KQZvQWRpE6Po3RdpwzJTzj9Z6Vm-jafeA-QslDCvcGNbB44qT512pkuiNjHlxLEG1OWXXp06HHNILZQ9EooItOCWQ_qJVPtTjWltUhKypkB_7rm1SLVy1MgWoeDzdVFolhYA9Uo8pSRSVcm3cs-nJw5wWsFLN2Ws0A3Qx79x9l83mzAm4wZF2Ei8CqCukYwkG5yO-v4pr8e6JLcseudeqImbGAMr3LWpCqdqQnpf5bd5YAiKzgcRUKfgBs0tohLHEZ-JJHhM5h-nb16CfWKCdGdNmG30sIhzCShUpcu7QG2Ee2imMRlzenZzMdt3YwuMTs9ddGWqKIqdGRgfpe-02yMMSUv7xdC8QjBJhr5DCoIYHXbBXq0mwYNkcfG1u87DxBXG1zZBc9dGd62LuKdLQqnuY2fgaBvjOv4af51IlOIS8FscOOhbj6jKdiwjNDsz1TuGiCEpA13UDMV5UYAKwABsdceh5NjNDGzG1IpTO-xFnVTTotKfwP4NvjSSPXINNABS5Q</value>
      <webElementGuid>4ac9fb32-2d5e-40fd-8d95-6b0d813dee93</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.5</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://demo-app.online/api/updateprofile</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>

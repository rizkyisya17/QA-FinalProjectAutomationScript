<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>SA-CP04</name>
   <tag></tag>
   <elementGuidId>21b9659c-163d-4139-bb5a-c3ae6d03670f</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIzIiwianRpIjoiYjJjZDA2ZGZkMjg4YjFjZGZmODI4ODRmNjhkZTk3OTlmMGVhMTQ5OTRjYjJiODljYTE5YmUzYTkyZjk3Mjg3YTIxNjgwMDQzYmM1YzY2ZmYiLCJpYXQiOjE2OTE0MDk5NzUuMjIxNDcyLCJuYmYiOjE2OTE0MDk5NzUuMjIxNDc1LCJleHAiOjE3MjMwMzIzNzUuMjE3NjA4LCJzdWIiOiI3NzAiLCJzY29wZXMiOltdfQ.JuEd1l44xHHjbjCFFHGVPy1WJSbdAOqkn_RAJrXBuEd0kAUlm_5JrpPtLnk1pfBC0uixb_Osnq4gS6OPDCSyCBupMs5Kuf2FouTIuhXAnpsa5yEPTb6SVxzmxxmvV6YPmwErRXUlh01l8IWn48TySa4uCmrmfiFY_EUzxy4DuPEOA77SniQp6-og0nmg4nS61rlj7UvTeltJgmWCGm9q38ht1yJLJALUoJFVCcNqQck0AEoBb6f5m-2uMdTWEPGR01_NRrWCjO9TI5iPhe3hhqPOkVyBmfuCz-wTbhyBU1Vnhk3VRigrzFnXOV3Dh-wrURYou3UA25t3wEtDLRNSAzJiFRHzRcYodjupoDMkfxAd0HUcgVHQz0dGy4YZ0QpAxm_qVcypkMjY5SodvDKSNW_jqtyftNffuOm6SgmpegXDJWf5broA9rtfLjEBBsH4mbuNmFBPxwCskVkDJvOD02JJgKVmMPzDTEWrMuH5MgTPNviyV6toRGPT2yNYQGW3mO6P34Jq3DiPiMDriRTcE5oaHBftwp7bhZel3SIpa63dY-mkqgxiMgabG_1V028xIft7PLBnOKWMMh6wyOz-gW5_O3g4QK3MbJCPDvIlxsw0ANkFhrYPVXj73EfWjFq9odp46bVLUqx4FVLO2hONGdt9VKwurLlsDieTMdRfXYw</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;contentType&quot;: &quot;multipart/form-data&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;,
  &quot;parameters&quot;: [
    {
      &quot;name&quot;: &quot;photo&quot;,
      &quot;value&quot;: &quot;D:\\test_img\\tes_img_gif.gif&quot;,
      &quot;type&quot;: &quot;File&quot;,
      &quot;contentType&quot;: &quot;&quot;
    }
  ]
}</httpBodyContent>
   <httpBodyType>form-data</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>multipart/form-data</value>
      <webElementGuid>f8c7dcb6-3cc3-4d69-8d11-8038e0dc1713</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIzIiwianRpIjoiYjJjZDA2ZGZkMjg4YjFjZGZmODI4ODRmNjhkZTk3OTlmMGVhMTQ5OTRjYjJiODljYTE5YmUzYTkyZjk3Mjg3YTIxNjgwMDQzYmM1YzY2ZmYiLCJpYXQiOjE2OTE0MDk5NzUuMjIxNDcyLCJuYmYiOjE2OTE0MDk5NzUuMjIxNDc1LCJleHAiOjE3MjMwMzIzNzUuMjE3NjA4LCJzdWIiOiI3NzAiLCJzY29wZXMiOltdfQ.JuEd1l44xHHjbjCFFHGVPy1WJSbdAOqkn_RAJrXBuEd0kAUlm_5JrpPtLnk1pfBC0uixb_Osnq4gS6OPDCSyCBupMs5Kuf2FouTIuhXAnpsa5yEPTb6SVxzmxxmvV6YPmwErRXUlh01l8IWn48TySa4uCmrmfiFY_EUzxy4DuPEOA77SniQp6-og0nmg4nS61rlj7UvTeltJgmWCGm9q38ht1yJLJALUoJFVCcNqQck0AEoBb6f5m-2uMdTWEPGR01_NRrWCjO9TI5iPhe3hhqPOkVyBmfuCz-wTbhyBU1Vnhk3VRigrzFnXOV3Dh-wrURYou3UA25t3wEtDLRNSAzJiFRHzRcYodjupoDMkfxAd0HUcgVHQz0dGy4YZ0QpAxm_qVcypkMjY5SodvDKSNW_jqtyftNffuOm6SgmpegXDJWf5broA9rtfLjEBBsH4mbuNmFBPxwCskVkDJvOD02JJgKVmMPzDTEWrMuH5MgTPNviyV6toRGPT2yNYQGW3mO6P34Jq3DiPiMDriRTcE5oaHBftwp7bhZel3SIpa63dY-mkqgxiMgabG_1V028xIft7PLBnOKWMMh6wyOz-gW5_O3g4QK3MbJCPDvIlxsw0ANkFhrYPVXj73EfWjFq9odp46bVLUqx4FVLO2hONGdt9VKwurLlsDieTMdRfXYw</value>
      <webElementGuid>0ec9930c-f8dd-4355-acc1-abdaed974cbf</webElementGuid>
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



```bash
export EDC_FS_CONFIG=$PWD/launchers/connector/provider.properties

export EDC_FS_CONFIG=$PWD/launchers/connector/consumer.properties

java -jar launchers/connector/build/libs/connector.jar 

# 0 dp
curl -H 'Content-Type: application/json' -d @extensions/policy/policy-time-interval/0-dataplane.json -X POST "http://localhost:18181/management/v2/dataplanes" -s | jq

# asset
curl -H 'Content-Type: application/json' -d @extensions/policy/policy-time-interval/1-asset.json -X POST "http://localhost:18181/management/v3/assets" -s | jq

# policy
curl -H 'Content-Type: application/json' -d @extensions/policy/policy-time-interval/2-policy-definition.json -X POST "http://localhost:18181/management/v2/policydefinitions" -s | jq

# contract
curl -H 'Content-Type: application/json' -d @extensions/policy/policy-time-interval/3-contract-definition.json -X POST "http://localhost:18181/management/v2/contractdefinitions" -s | jq




# get dataset
curl -H 'Content-Type: application/json' -d @extensions/policy/policy-time-interval/4-get-dataset.json -X POST "http://localhost:28181/management/v2/catalog/dataset/request" -s | jq

# negotiate
curl -H 'Content-Type: application/json' -d @extensions/policy/policy-time-interval/5-negotiate-contract.json  -X POST "http://localhost:28181/management/v2/contractnegotiations" -s | jq

# get agreementID 
curl "http://localhost:28181/management/v2/contractnegotiations/ec25e6d0-9589-4992-8319-985c186fa8f8" -s | jq

#transfer
curl -H 'Content-Type: application/json' -d @extensions/policy/policy-time-interval/6-transfer.json -X POST "http://localhost:28181/management/v2/transferprocesses" -s | jq





# transferprocesses test
curl -X POST "http://localhost:18181/management/v2/transferprocesses/2861db43-55df-4404-a0a0-2bb0d5c5abf8/resume" -s | jq

curl -H 'Content-Type: application/json' -d @extensions/policy/policy-time-interval/7-suspend.json -X POST "http://localhost:18181/management/v2/transferprocesses/2861db43-55df-4404-a0a0-2bb0d5c5abf8/suspend" -s | jq

curl -H 'Content-Type: application/json' -d @extensions/policy/policy-time-interval/8-terminate.json -X POST "http://localhost:18181/management/v2/transferprocesses/2861db43-55df-4404-a0a0-2bb0d5c5abf8/terminate" -s | jq

```
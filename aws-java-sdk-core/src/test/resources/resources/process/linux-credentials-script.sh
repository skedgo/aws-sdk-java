#!/usr/bin/env bash

if [[ $1 = "--account-id" ]]; then
  shift
  accountId=$1;
  shift
fi;

echo '{';
echo '"Version": 1,';
echo "\"AccessKeyId\": \"$1\",";
echo "\"SecretAccessKey\": \"$2\"";
if [[ $accountId ]]; then
    echo ','
    echo "\"AccountId\": \"$accountId\"";
fi;
if [[ $# -ge 3 ]]; then
    echo ','
    echo "\"SessionToken\": \"$3\"";
fi;
if [[ $# -ge 4 ]]; then
    echo ','
    echo "\"Expiration\": \"$4\"";
fi;
echo '}';
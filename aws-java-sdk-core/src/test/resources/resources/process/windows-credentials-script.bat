@ECHO OFF
SET input=%1

IF "%1"=="--account-id" (
    SET accountId="%2"
    SHIFT
    SHIFT
)

ECHO {
ECHO "Version": 1,
ECHO "AccessKeyId": "%1",
ECHO "SecretAccessKey": "%2"
IF DEFINED accountId (
    ECHO ,
    ECHO "AccountId": %accountId%
)
IF NOT "%3"=="" (
    ECHO ,
    ECHO "SessionToken": "%3"
)
IF NOT "%4"=="" (
    ECHO ,
    ECHO "Expiration": "%4"
)
echo }
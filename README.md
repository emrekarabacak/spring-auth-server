# spring-auth-server

<h3>Get Access Token: </h3>

```
curl -X POST \
  http://localhost:9000/oauth/token \
  -H 'authorization: Basic YXV0aHNlcnZlcjp0ZXN0' \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/x-www-form-urlencoded' \
  -H 'postman-token: 618cbc73-b8fb-a4cf-0e43-de99a3210e83' \
  -d 'grant_type=password&username=user&password=1234'
 ```
  
 <h3> Response : </h3>
  
  ```
  {
   "access_token": "eyJhbGciOiJSUzI1NiJ9.eyJleHAiOjE1MjIzMDQ2MjIsInVzZXJfbmFtZSI6InVzZXIiLCJhdXRob3JpdGllcyI6WyJST0xFX0FETUlOIl0sImp0aSI6IjQzNGZkZTk0LTUzMDEtNGYyNC1hNTZmLTYyNWExZGFlZDUxNyIsImNsaWVudF9pZCI6ImF1dGhzZXJ2ZXIiLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiXX0.IdvKkTQviO_NeXjaRN-9Cgy_8ergTIDnzWfh1Ja06ZZKVHUdyG3BdDeFJmiAmbrRUWCn2yeDLm313tINjdSERFoFYzb0eHC2tJGEEB4TKB1Rna5TSOUSYlSxYg6YMhtwP5SrSnvKbh1g6c7pNdmkZt3SdcmFBjtFjwb0c2wre2bVKoihe9xhrMYpu0K0TWGd_w5RFHqhTXMyZNlAMt0d_-7shPbUf7bMVRGvjNrSxe7s-uS6svlWqWEXSloDk4l7SPCakNbJazZSpJNFXlEt5AuZTE3NDGSB9UZNtf3DoVUZlwtc9IC4Q1_3IWHqu2NjV9HMvuwLZdC7n9ai534-sg",
    "token_type": "bearer",
    "refresh_token": "eyJhbGciOiJSUzI1NiJ9.eyJ1c2VyX25hbWUiOiJ1c2VyIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl0sImF0aSI6IjQzNGZkZTk0LTUzMDEtNGYyNC1hNTZmLTYyNWExZGFlZDUxNyIsImV4cCI6MTUyNDg1MzQyMiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9BRE1JTiJdLCJqdGkiOiJiY2U3NDI2Yi03MzM1LTRiNzctOWJkYy1lOWI2NWYxMDVmMTYiLCJjbGllbnRfaWQiOiJhdXRoc2VydmVyIn0.YVL9qyTMjhVyh-GoeRm6f1KUqNFHzSCU3WO-Xt5AzXFQsrkdaJH28XWq6tBi18QquOf0HVqxN1KJrUxeF-Ivw9ItuSMmx7w6UF5vPOp59Xc1ijtezvDcs05qwma6HvOVpqVormD3um5q2ftmMwkuIrHd0wIkypHFNBNt7P-kUsmBQ_0UxDApEcBHeVQYX-RiKggGpNUkqng-5ef3M7YztxP8jpvGWVC5WZyrO3OiJaTRf6cJmc4PkrINEhRfNsH-FuoytzjP9pSu3_bJQrPvNp0LUCryX1S4kMAgyhlq4q7FReuw5zzVgVYhsTZtLHhN3xz7LoE9CBkTFL94f7RsUg",
    "expires_in": 43199,
    "scope": "read write",
    "jti": "434fde94-5301-4f24-a56f-625a1daed517"
}

```
  
<h3> Refresh Token : </h3>
  
  ```
  curl -X POST \
  http://localhost:9000/oauth/token \
  -H 'authorization: Basic YXV0aHNlcnZlcjp0ZXN0' \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/x-www-form-urlencoded' \
  -H 'postman-token: 19d5cf66-1dc0-7511-06f1-12d6c522bfba' \
  -d 'grant_type=refresh_token&refresh_token=eyJhbGciOiJSUzI1NiJ9.eyJ1c2VyX25hbWUiOiJ1c2VyIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl0sImF0aSI6IjQzNGZkZTk0LTUzMDEtNGYyNC1hNTZmLTYyNWExZGFlZDUxNyIsImV4cCI6MTUyNDg1MzQyMiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9BRE1JTiJdLCJqdGkiOiJiY2U3NDI2Yi03MzM1LTRiNzctOWJkYy1lOWI2NWYxMDVmMTYiLCJjbGllbnRfaWQiOiJhdXRoc2VydmVyIn0.YVL9qyTMjhVyh-GoeRm6f1KUqNFHzSCU3WO-Xt5AzXFQsrkdaJH28XWq6tBi18QquOf0HVqxN1KJrUxeF-Ivw9ItuSMmx7w6UF5vPOp59Xc1ijtezvDcs05qwma6HvOVpqVormD3um5q2ftmMwkuIrHd0wIkypHFNBNt7P-kUsmBQ_0UxDApEcBHeVQYX-RiKggGpNUkqng-5ef3M7YztxP8jpvGWVC5WZyrO3OiJaTRf6cJmc4PkrINEhRfNsH-FuoytzjP9pSu3_bJQrPvNp0LUCryX1S4kMAgyhlq4q7FReuw5zzVgVYhsTZtLHhN3xz7LoE9CBkTFL94f7RsUg'
  ```

<h3> Response : </h3>

  ```
{
    "access_token": "eyJhbGciOiJSUzI1NiJ9.eyJleHAiOjE1MjIzMDQ5ODksInVzZXJfbmFtZSI6InVzZXIiLCJhdXRob3JpdGllcyI6WyJST0xFX0FETUlOIl0sImp0aSI6IjEwNWE2MDBjLTI5ZTQtNDBhYS05YjZiLTk0NDQwNzEyMzVmMyIsImNsaWVudF9pZCI6ImF1dGhzZXJ2ZXIiLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiXX0.kD8p2ZddEWG8Sbp51dov4F0AOF4edlFtf0LHad-NNlGjlywa8oDaXhzI4mvXQzfMQmKRBakICxcA1rTa4xGwMRHIjDBbr5hVeYRFVW2jurXlWcevQcyV6j5ErkvpgYEB1vKypXMFI-HebBgzRmrtLnhWO8XvlsXKmU43QnTCIgHJVlH53h-_vwq6Mu2fNAfA6qJGjcCCX3QjPDaK4uoOdou25NbIfEUf8A32t-kHNaFxqGEm0QBF3HEP2ED39kKrNJlRp_cS3n2LpFVwzJr0DbVciYqmGq_fEb5zqxNIWrRVBcNI--sQPvxK74ry8JoUY-7h2PegU699EwQ3fBptWQ",
    "token_type": "bearer",
    "refresh_token": "eyJhbGciOiJSUzI1NiJ9.eyJ1c2VyX25hbWUiOiJ1c2VyIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl0sImF0aSI6IjEwNWE2MDBjLTI5ZTQtNDBhYS05YjZiLTk0NDQwNzEyMzVmMyIsImV4cCI6MTUyNDg1MzQyMiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9BRE1JTiJdLCJqdGkiOiJiY2U3NDI2Yi03MzM1LTRiNzctOWJkYy1lOWI2NWYxMDVmMTYiLCJjbGllbnRfaWQiOiJhdXRoc2VydmVyIn0.RLCpQZugsZp5NOfGlPngSqSWVHHLDhfPq7un27Q6bI9WCmWEjSKhVqoomOUKqpAB_rusiHgi36dQtE6PMA2fYr8siyTYsOFah-VAJlFnT-XzLco6ha3C-2fs8DWZIuHPTzqACeGt7WoPEb3RCWiptpy5YxJoNgGvdBuZWoAH1ntS5j52_tEEE9mFq35UAG_92WBcpLGhT7BIw9_XaReNSI4lob6Nawmcc8IFDfILJd8kttwfNJ01iRv7ETNXmTb96bK23jPPJX7B4lLxpZPLwcdbHacsLivGOlcBWE9C-HEEK2pYu6DDU_eI0dVlW8Tv5TWThubDIUwpec0Hf1D6Dw",
    "expires_in": 43199,
    "scope": "read write",
    "jti": "105a600c-29e4-40aa-9b6b-9444071235f3"
}
  ```

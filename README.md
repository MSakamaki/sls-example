# sls-example

serverless java springboot2 maven example

## local run

```sh
npx ts-node ./functions/local.ts
```

## deploy

```sh
npm run build

mvn clean
mvn clean package
mvn clean install

npx sls deploy --aws-profile [profile] --stage [sha hash]

npx sls deploy --aws-profile me --stage test
npx sls remove --aws-profile me --stage test

```

# sls-example

## local run

```sh
npx ts-node ./functions/local.ts
```

## deploy

```sh
npm run build

npx sls deploy --aws-profile [profile] --stage [sha hash]

npx sls deploy --aws-profile me --stage test
npx sls remove --aws-profile me --stage test

```

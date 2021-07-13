import serverlessExpress from '@vendia/serverless-express';
import { app, router } from "./app";

app.use('/', router);

export default serverlessExpress({ app });

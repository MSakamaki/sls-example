import * as express from 'express';
import { join } from 'path';
import { app, router } from './app';


app.use(express.static(join(__dirname, '../src')));
app.use('/api', router);

app.listen(3000, () => {
    console.log('listening', 3000);
});

import express from 'express';
export const app = express();
export const router = express.Router();

router.get('/', (req, res) => {
  res.json({message : 'Hello World!'});
});
router.get('/users', (req, res) => {
  res.json([{name: 'Taro'}, {name: 'Hanako'}]);
});


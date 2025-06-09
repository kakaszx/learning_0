const { Router } = require('express');
const PessoaController = require('../controllers/PessoaControllers.js');

const router = Router();

router.get('/pessoas', PessoaController.pegaTodas);

module.exports = router;

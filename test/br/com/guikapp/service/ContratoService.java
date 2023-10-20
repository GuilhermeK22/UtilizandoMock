package br.com.guikapp.service;

import br.com.guikapp.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;
    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }
}

package br.com.guikapp.service;

import br.com.guikapp.dao.ClienteDao;
import br.com.guikapp.dao.IClienteDao;

public class ClienteService {
    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        this.clienteDao = clienteDao;
    }
    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }
}

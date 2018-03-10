package br.com.henckes.carroapi.service

import br.com.henckes.carroapi.model.Carro
import br.com.henckes.carroapi.repository.CarroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CarroService {

    @Autowired
    lateinit var carroRepository : CarroRepository

    fun buscarTodosCarros() : List<Carro>{
        return carroRepository.findAll()
    }

    fun burcarCarroPorAno(ano: Int) : List<Carro>{
        return carroRepository.findByAno(ano)
    }

    fun buscarCarroPorMarca(marca: String) : List<Carro>{
        return carroRepository.findByMarcaContaining(marca)
    }

    fun buscarCarroPorPlaca(placa: String) : Carro{
        return carroRepository.findByPlacaContaining(placa)
    }

    fun salvar(carro: Carro){
        carroRepository.save(carro)
    }
}
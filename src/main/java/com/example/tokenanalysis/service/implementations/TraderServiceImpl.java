package com.example.tokenanalysis.service.implementations;

import com.example.tokenanalysis.DTO.TraderDTO;
import com.example.tokenanalysis.entity.Trader;
import com.example.tokenanalysis.mapper.MapperUtil;
import com.example.tokenanalysis.mapper.TraderMapper;
import com.example.tokenanalysis.repository.TraderRepository;
import com.example.tokenanalysis.service.TraderService;
import com.example.tokenanalysis.service.WalletService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TraderServiceImpl implements TraderService{
    private final TraderRepository traderRepository;
    private final MapperUtil mapper;
    private final WalletService walletService;

    public TraderServiceImpl(TraderRepository traderRepository, MapperUtil mapper, WalletService walletService) {
        this.traderRepository = traderRepository;
        this.mapper = mapper;
        this.walletService = walletService;
    }

    @Override
    public List<TraderDTO> listAllTraders() {
        List<Trader> traderList = traderRepository.findAll();
        return traderList.stream().map(trader->mapper.convert(trader,new TraderDTO())).collect(Collectors.toList());
    }

    @Override
    public TraderDTO findByUserName(String username) {
        Trader trader = traderRepository.findByUserName(username);
        return mapper.convert(trader,new TraderDTO() );
    }

    @Override
    public void save(TraderDTO trader) {

        traderRepository.save(mapper.convert(trader,new Trader() ));
    }




    public void deleteById(String s) {

    }

  @Override
    public TraderDTO update(TraderDTO trader) {
      //Find current trader
      Trader trader1 = traderRepository.findByUserName(trader.getUserName());  //has id
      //Map update trader dto to entity object
      Trader convertedTrader = mapper.convert(trader,new Trader() );   // has id?
      //set id to the converted object
      convertedTrader.setId(trader1.getId());
      //save the updated trader in the db
      traderRepository.save(convertedTrader);

      return findByUserName(trader.getUserName());
    }

    @Override
    public void delete(String username) {
        Trader trader = traderRepository.findByUserName(username);

        if (trader.isEnabled()) {
            trader.setEnabled(false);
            trader.setUserName(trader.getUserName() + "-" + trader.getId());  // harold@manager.com-2
            traderRepository.save(trader);
        }
    }
}

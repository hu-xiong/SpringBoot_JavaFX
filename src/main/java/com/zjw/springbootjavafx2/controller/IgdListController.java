package com.zjw.springbootjavafx2.controller;

import com.zjw.springbootjavafx2.Springbootjavafx2Application;
import com.zjw.springbootjavafx2.pojo.VO.IgdVO;
import com.zjw.springbootjavafx2.pojo.entity.Ingredient;
import com.zjw.springbootjavafx2.service.IgdService;
import com.zjw.springbootjavafx2.view.MenuView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

import javax.annotation.Resource;
import java.net.URL;
import java.util.*;

@FXMLController
public class IgdListController implements Initializable {

    @Resource
    IgdService igdService;

    private ResourceBundle resourceBundle;
    public ObservableList<IgdVO> list = FXCollections.observableArrayList();

    @FXML private TableView dataTable;
    @FXML private TableColumn igdName;
    @FXML private TableColumn idgType;
    @FXML private TableColumn enterHouseTime;
    @FXML private TableColumn igdDruation;
    @FXML private TableColumn igdMaxDruation;
    @FXML private TableColumn igdGrade;
    @FXML private TableColumn relativeDish;
    @FXML private TableColumn relativeSupplier;
    @FXML private TableColumn choice;


    private void config(){
        igdName.setCellValueFactory(new PropertyValueFactory<>("igdName"));
        idgType.setCellValueFactory(new PropertyValueFactory<>("igdType"));
        enterHouseTime.setCellValueFactory(new PropertyValueFactory<>("igdEnterHouseTime"));
        /*igdDruation.setCellValueFactory(new PropertyValueFactory<>("igdDuration"));*/
        igdMaxDruation.setCellValueFactory(new PropertyValueFactory<>("igdMaxduration"));
        /*igdGrade.setCellValueFactory(new PropertyValueFactory<>("igdGrade"));*/
        /*relativeDish.setCellValueFactory(new PropertyValueFactory<>("igdSupplier"));*/
        relativeSupplier.setCellValueFactory(new PropertyValueFactory<>("igdSupplier"));
        choice.setCellFactory((col) -> {
            TableCell<IgdVO, String> cell = new TableCell<IgdVO, String>() {

                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    this.setText(null);
                    this.setGraphic(null);

                    if (!empty) {
                        /*ImageView delICON = new ImageView(getClass().getResource("delete.png").toString());*/
                        Button delBtn = new Button("删除");
                        this.setGraphic(delBtn);
                        delBtn.setOnMouseClicked((me) -> {
                            IgdVO clickedStu = this.getTableView().getItems().get(this.getIndex());

                            System.out.println("删除 " + clickedStu.getIgdId() + clickedStu.getIgdName()  + " 的记录");

                            if(  igdService.deleteIngredientl(clickedStu.getIgdId())  ){
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.titleProperty().set("信息提示：");
                                alert.headerTextProperty().set("删除成功!");
                                alert.showAndWait();
                            }else {
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.titleProperty().set("信息提示：");
                                alert.headerTextProperty().set("删除失败!");
                                alert.showAndWait();
                            }
                        });
                    }
                }

            };
            return cell;
        });



    }

    @FXML public void delete(){

    }

    @FXML public void back(){
        Springbootjavafx2Application.showView(MenuView.class);
    }


    @FXML public void showAll(){
        dataTable.getItems().clear();
        config();
        list.addAll(generate());
        dataTable.setItems(list);

    }

    private List<IgdVO> generate(){
        List<IgdVO> list = new ArrayList<IgdVO>();
        List<Ingredient> listPrimary = igdService.showAll();
        Iterator<Ingredient> i = listPrimary.iterator();

        while (i.hasNext()){
            IgdVO igdVO = new IgdVO(i.next());
            list.add(igdVO);
        }

        return list;
    }


    @Override
    public void initialize(URL url, ResourceBundle rb){
        this.resourceBundle = rb;
    }
}

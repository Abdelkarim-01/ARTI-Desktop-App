package com.arti.artiDesktop.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

@Controller
@FxmlView("Agent_space.fxml")
public class AgentController {

    @FXML
    private Button btn_heur_entrer;

    @FXML
    private Circle circle_profile;

    @FXML
    private ListView<Integer> list_heur;

    @FXML
    private ListView<Integer> list_munit;

    @FXML
    private Button logout_btn;

    @FXML
    private TextField txt_heur_entrer;
    @FXML
    private AnchorPane anchorpane_heur_entrer;
    @FXML
    private Button btn_heur_sortie;

    @FXML
    private TextField txt_heur_sortie;
    @FXML
    private ListView<Integer> list_heur1;
    @FXML
    private ListView<Integer> list_munit1;
    @FXML
    private AnchorPane anchorpane_heur_sortie;
    @FXML
    private AnchorPane ancropane_noter_presence;
    @FXML
    private DatePicker date_jour_presence;
    @FXML
    private TableView tableviewpresence;

    @FXML
    private TableColumn col_datejour_prese;

    @FXML
    private TableColumn col_heureentree_prese;

    @FXML
    private TableColumn col_heuresortie_prese;

    @FXML
    private Button btn_tout_les_moi;
    @FXML
    private Button btn_confirmer_presence;

    @FXML
    private Button btn_dans_cemois;

    @FXML
    private AnchorPane anchorepane_ajouter_rendezvous;

    @FXML
    private AnchorPane anchorepane_presence;

    @FXML
    private AnchorPane anchorepane_voir_rendezvous;

    @FXML
    private Button btn_presence;

    @FXML
    private Button btn_rendez_vous;

    @FXML
    private Button btn_voir_rendez_vous;

    // from copy


    @FXML
    private Label agent_nom_label;

    @FXML
    private Button btn_confirmer_rendez_vous;

    @FXML
    private CheckBox check_garger_maison;

    @FXML
    private CheckBox check_grenier_accecible;

    @FXML
    private CheckBox check_grenier_habitable;

    @FXML
    private CheckBox check_sous_sol_fini;

    @FXML
    private CheckBox check_thermopompe;

    @FXML
    private ComboBox<String> combo_autre_chauffage;

    @FXML
    private ComboBox<String> combo_hauteur_grenier;

    @FXML
    private ComboBox<String> combo_isolation_grenier;
    @FXML
    private ComboBox<String> combo_type_thermopompe;

    @FXML
    private ComboBox<String> combo_tranche_age;

    @FXML
    private ComboBox<String> combo_type_chauffage;

    @FXML
    private ComboBox<String> combo_type_maison;

    @FXML
    private Label lab_combo_type_thermopompe;

    @FXML
    private DatePicker date_rendez_vous;

    @FXML
    private Label lab_adresse_client;

    @FXML
    private Label lab_combo_autre_chauffage;

    @FXML
    private Label lab_combo_hauteur_grenier;

    @FXML
    private Label lab_combo_isolation_grenier;

    @FXML
    private Label lab_combo_tranche_age;

    @FXML
    private Label lab_combo_type_chauffage;

    @FXML
    private Label lab_combo_type_maison;

    @FXML
    private Label lab_date_rendez_vous;

    @FXML
    private Label lab_duree_propritee;

    @FXML
    private Label lab_nom_client;

    @FXML
    private Label lab_prenom_client;

    @FXML
    private Label lab_tele_client;

    @FXML
    private Label lab_txt_duree_thermopompe;

    @FXML
    private Label lab_txt_secteur_activiter;
    @FXML
    private Label lab_heur_renddezvous;
    @FXML
    private Label lab_txt_taxe_electricite;

    @FXML
    private TextArea txt_adresse_client;

    @FXML
    private TextArea txt_autre_information;

    @FXML
    private TextField txt_duree_propritee;

    @FXML
    private TextField txt_duree_thermopompe;

    @FXML
    private TextField txt_nom_client;

    @FXML
    private TextField txt_prenom_client;

    @FXML
    private TextField txt_secteur_activiter;

    @FXML
    private TextField txt_taxe_electricite;


    @FXML
    private TextField txt_heur_rendezvous;

    @FXML
    private Button btn_heur_rendezvous;
    @FXML
    private AnchorPane anchorpane_heur_rendez_vous;
    @FXML
    private ListView<Integer> list_munit2;

    @FXML
    private ListView<Integer> list_heur2;
    @FXML
    private TextField txt_tele_client;

    @FXML
    private TableView table_voir_rendez_vous;

    @FXML
    private TableColumn colum_date_obtention;

    @FXML
    private TableColumn colum_date_rendezvous;

    @FXML
    private TableColumn colum_nom_client;

    @FXML
    private TableColumn colum_pren_client;

    @FXML
    private TableColumn column_admin_comment;
    @FXML
    private DatePicker date_a;

    @FXML
    private DatePicker date_de;
    @FXML
    private TableColumn column_etat;
    //  DATABASE TOOLS
    private Connection connect;
    private PreparedStatement prepare;
    private Statement statement;
    private ResultSet result;

    public void onactionbtn_presence(ActionEvent actionEvent) {
    }

    public void onactionbtn_voir_rendezvous(ActionEvent actionEvent) {
    }

    public void onactionbtn_ajouter_rendezvous(ActionEvent actionEvent) {
    }

    public void logout(ActionEvent actionEvent) {
    }

    public void masquer_anchorepane_heure(MouseEvent mouseEvent) {
    }

    public void confirmer_presence(ActionEvent actionEvent) {
    }

    public void choisirheurentrer(ActionEvent actionEvent) {
    }

    public void choisirheuresortie(ActionEvent actionEvent) {
    }

    public void tablepresenceDisplayData1(ActionEvent actionEvent) {
    }

    public void tablepresenceDisplayData(ActionEvent actionEvent) {
    }

    public void choisirdaterendezvous(ActionEvent actionEvent) {
    }

    public void onaction_confirmer_rendezvous(ActionEvent actionEvent) {
    }

    public void table_rendez_vous_DisplayData(ActionEvent actionEvent) {
    }
}

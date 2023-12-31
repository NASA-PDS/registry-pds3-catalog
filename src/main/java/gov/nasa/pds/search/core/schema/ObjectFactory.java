//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 03:31:49 PM PDT 
//


package gov.nasa.pds.search.core.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.nasa.pds.search.core.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CheckAssociations_QNAME = new QName("", "checkAssociations");
    private final static QName _OutputString_QNAME = new QName("", "outputString");
    private final static QName _Query_QNAME = new QName("", "query");
    private final static QName _RegistryPath_QNAME = new QName("", "registryPath");
    private final static QName _Url_QNAME = new QName("", "url");
    private final static QName _Product_QNAME = new QName("", "product");
    private final static QName _Field_QNAME = new QName("", "field");
    private final static QName _IndexFields_QNAME = new QName("", "indexFields");
    private final static QName _Title_QNAME = new QName("", "title");
    private final static QName _Source_QNAME = new QName("", "source");
    private final static QName _RegistryObjectType_QNAME = new QName("", "registryObjectType");
    private final static QName _Value_QNAME = new QName("", "value");
    private final static QName _Specification_QNAME = new QName("", "specification");
    private final static QName _DataSources_QNAME = new QName("", "dataSources");
    private final static QName _RegistryObjectName_QNAME = new QName("", "registryObjectName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.nasa.pds.search.core.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link Specification }
     * 
     */
    public Specification createSpecification() {
        return new Specification();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link DataSource }
     * 
     */
    public DataSource createDataSource() {
        return new DataSource();
    }

    /**
     * Create an instance of {@link IndexField }
     * 
     */
    public IndexField createIndexField() {
        return new IndexField();
    }

    /**
     * Create an instance of {@link OutputString }
     * 
     */
    public OutputString createOutputString() {
        return new OutputString();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link DataSources }
     * 
     */
    public DataSources createDataSources() {
        return new DataSources();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "checkAssociations", defaultValue = "false")
    public JAXBElement<Boolean> createCheckAssociations(Boolean value) {
        return new JAXBElement<Boolean>(_CheckAssociations_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutputString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "outputString")
    public JAXBElement<OutputString> createOutputString(OutputString value) {
        return new JAXBElement<OutputString>(_OutputString_QNAME, OutputString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Query }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "query")
    public JAXBElement<Query> createQuery(Query value) {
        return new JAXBElement<Query>(_Query_QNAME, Query.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "registryPath")
    public JAXBElement<String> createRegistryPath(String value) {
        return new JAXBElement<String>(_RegistryPath_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "url")
    public JAXBElement<String> createUrl(String value) {
        return new JAXBElement<String>(_Url_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Field }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "field")
    public JAXBElement<Field> createField(Field value) {
        return new JAXBElement<Field>(_Field_QNAME, Field.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "indexFields")
    public JAXBElement<IndexField> createIndexFields(IndexField value) {
        return new JAXBElement<IndexField>(_IndexFields_QNAME, IndexField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "source")
    public JAXBElement<DataSource> createSource(DataSource value) {
        return new JAXBElement<DataSource>(_Source_QNAME, DataSource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "registryObjectType")
    public JAXBElement<String> createRegistryObjectType(String value) {
        return new JAXBElement<String>(_RegistryObjectType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value")
    public JAXBElement<String> createValue(String value) {
        return new JAXBElement<String>(_Value_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Specification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "specification")
    public JAXBElement<Specification> createSpecification(Specification value) {
        return new JAXBElement<Specification>(_Specification_QNAME, Specification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSources }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dataSources")
    public JAXBElement<DataSources> createDataSources(DataSources value) {
        return new JAXBElement<DataSources>(_DataSources_QNAME, DataSources.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "registryObjectName")
    public JAXBElement<String> createRegistryObjectName(String value) {
        return new JAXBElement<String>(_RegistryObjectName_QNAME, String.class, null, value);
    }

}

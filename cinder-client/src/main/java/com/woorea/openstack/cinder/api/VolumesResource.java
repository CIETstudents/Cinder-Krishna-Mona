package com.woorea.openstack.cinder.api;

import com.woorea.openstack.base.client.Entity;
import com.woorea.openstack.base.client.HttpMethod;
import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackRequest;
import com.woorea.openstack.cinder.model.Volume;
import com.woorea.openstack.cinder.model.Volumes;
import com.woorea.openstack.cinder.model.VolumeTypes;
import com.woorea.openstack.cinder.model.VolumeManage;

/**
 * This Class contains all the resources of volume consumed.
 * @author Krishna <krishna.it2329@gmail.com>
 * @author Mona <Mona@gmail.com>
 */
public class VolumesResource {

    /**
     * An instance CLIENT is created for the OpenStackClient API.
     */
    private final OpenStackClient CLIENT;

    /**
     * This method is used to access the VolumeResource class.
     * @param client gives the Client Request.
     */
    public VolumesResource(OpenStackClient client) {
        CLIENT = client;
    }

    /**
     * Method is created to list attributes.
     * @param detail the detail to set
     * @return the list
     */
    public List list(boolean detail) {
        return new List(detail);
    }

    /**
     * This method is to create volume.
     * @param volume gives the volume consumed detail
     * @return volume variable for create method
     */
    public Create create(Volume volume) {
        return new Create(volume);
    }

    /**
     * This method is used to create string identifier.
     * @param id gives id of Client
     * @return Shows new id value
     */
    public Show show(String id) {
        return new Show(id);
    }

    /**
     * This method is to update string identifier.
     * @param id gives id of Client
     * @return Shows new id value
     */
    public Update update(String id) {
        return new Update(id);
    }

    /**
     *  This method is to manage string identifier.
     * @param id gives id of Client
     * @return Shows new id value
     */
    public Manage manage(String id) {
        return new Manage(id);
    }

    /**
     * identifier finds out types of methods in volume.
     * @param id gives id of Client
     * @return new identifier value.
     */
    public Types types(String id) {
        return new Types(id);
    }

    /**
     * This method is to delete the string.
     * @param id gives id of Client
     * @return deleted id value
     */
    public Delete delete(String id) {
        return new Delete(id);
    }

    /**
     * The class List extends the Volumes class.
     */
    public class List extends OpenStackRequest<Volumes> {

        /**
         * Parameterized Constructor for the list Class and return type of boolean.
         * @param detail the detail to set
         */
        public List(boolean detail) {
            super(CLIENT, HttpMethod.GET, detail ? "/os-volumes/detail"
                    : "/os-volumes", null, Volumes.class);
        }
    }

    /**
     * Class Create inherits the OpenStackRequest given by the Client and pass
     * to the Volume Class.
     */
    public class Create extends OpenStackRequest<Volume> {

        /**
         * The instance is created for the Volume class.
         */
        private Volume volume;

        /**
         * The created method  and has the parameter of return type volume and calls the HttpMethod "POST".         *
         * @param volume to point the volume Class. volume points to the "this" pointer.
         */
        public Create(Volume volume) {
            super(CLIENT, HttpMethod.POST, "/volumes", Entity.json(volume), Volume.class);
            this.volume = volume;
        }

    }

    /**
     * The class Show extends the Volume class.
     */
    public class Show extends OpenStackRequest<Volume> {

        /**
         * Method Show is used to show the id value of the Client, it is Constructor and depends on the Base Class.
         * @param id gives the Client Id.
         */
        public Show(String id) {
            super(CLIENT, HttpMethod.GET, new StringBuilder("/os-volumes/")
                    .append(id).toString(), null, Volume.class);
        }
    }

    /**
     * The class Show extends the Volume class.
     */
    public class Update extends OpenStackRequest<Volume> {

        /**
         * Method Update is used to update the id value of the Client, it is
         * Constructor and depends on the Base Class.
         * @param id gives the Client Id.
         */
        public Update(String id) {
            super(CLIENT, HttpMethod.PUT, new StringBuilder("/os-volumes/")
                    .append(id).toString(), null, Volume.class);
        }
    }
        
     /**
      * The class Manage extends the Volume class.
      */
    public class Manage extends OpenStackRequest<VolumeManage> {

        /**
         * Method Manage is used to show the id value of the Client, it is Constructor and depends on the Base Class.
         * @param id gives the Client Id.
         */
        public Manage(String id) {
            super(CLIENT, HttpMethod.POST, new StringBuilder("/os-volumes/")
                    .append(id).toString(), null, VolumeManage.class);
        }
    }

    /**
     * The class Types extends the Volume class.
     */
    public class Types extends OpenStackRequest<VolumeTypes> {

        /**
         * Method Types is used to show the id value of the Client, it is
         * Constructor and depends on the Base Class.
         * @param id gives the Client Id.
         */
        public Types(String id) {
            super(CLIENT, HttpMethod.GET, new StringBuilder("/os-volumes/")
                    .append(id).toString(), null, VolumeTypes.class);
        }
    }

    /**
     * The class Delete extends the OpenStackRequest class.
     */
    public class Delete extends OpenStackRequest<Void> {

        /**
         * Constructor method of Delete and Calls the HttpMethod of Delete.
         * @param id gives the Client Id.
         */
        public Delete(String id) {
            super(CLIENT, HttpMethod.DELETE, new StringBuilder("/os-volumes/")
                    .append(id).toString(), null, Void.class);
        }
    }
}

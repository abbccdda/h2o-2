package water.api.rest.handlers;

import water.api.CloudStatus;
import water.api.rest.Version;

public class CloudStatusHandlerV1 extends DKVHandler<Version.V1> {
  public CloudStatusHandlerV1(String path) {
    super(path);
  }

  @Override public water.Iced findObject(String path) {
    CloudStatus cs = new CloudStatus();
    cs.cloud_name = "TEST";
    return cs;
  };

}
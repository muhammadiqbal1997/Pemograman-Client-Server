package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new id.ac.amikom.appmanga.DataBinderMapperImpl());
  }
}

FROM polyaxon/polyaxon:cpu-3-130

MAINTAINER mourad mourafiq <mouradmourafiq@gmail.com>

# copy requirements.txt
COPY requirements.txt /setup/
COPY requirements-test.txt /setup/
RUN pip3 install --no-cache-dir -r /setup/requirements-test.txt

VOLUME /polyaxon
WORKDIR /polyaxon
copy . /polyaxon


# TensorBoard
EXPOSE 6006
# IPython
EXPOSE 8888
